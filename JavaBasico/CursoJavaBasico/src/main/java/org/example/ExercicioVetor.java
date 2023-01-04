package org.example;

import java.util.Scanner;

public class ExercicioVetor {

    public static void main(String[] args){

        //faça um programa que leia um número
        //e imprima qual dia da semana
        //de acordo com o número lido usando o vetor
        //[Domingo,Segunda,Terça,Quarta,Quinta,Sexta,Sábado]

        final String[] diasSemana = {"Segunda","Terça","Quarta","Quinta","Sexta","Sábado","Domingo"};
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7:");
        int numDiaSemana = leitor.nextInt();

        while (numDiaSemana < 1 || numDiaSemana > 7){
            System.out.print("Número inválido! \n");
            System.out.println("Por favor, digite um número entre 1 e 7");

            System.out.println("Digite um número de 1 a 7:");
            numDiaSemana = leitor.nextInt();
        }

            System.out.println(diasSemana[numDiaSemana-1]);


    }
}
