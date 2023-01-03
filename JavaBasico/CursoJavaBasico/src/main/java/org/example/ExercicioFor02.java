package org.example;

import java.util.Scanner;

public class ExercicioFor02 {

    public static void main(String[] args){

        //faça um programa que leia cinco valores(usando o for)
        //e mostre a soma deles

        Scanner leitor = new Scanner(System.in);
        int valor;
        int soma =0;

        for (int repetir = 0; repetir < 5; repetir++) {

            System.out.println("Digite um valor:");
            valor = leitor.nextInt();
            soma = soma + valor;

        }
        System.out.println("A soma dos valores digitados é: " + soma);
    }
}
