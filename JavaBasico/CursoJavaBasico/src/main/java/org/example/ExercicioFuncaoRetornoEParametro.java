package org.example;

import java.util.Scanner;

public class ExercicioFuncaoRetornoEParametro {

    //faça um programa que leia um nome, idade e peso
    //e imprima na tela as informações da seguinte forma:
    /*Nome:
      Idade:
      Peso:
     */

    static String imprimeNome(String a){

        System.out.println("Nome: " + a);
        return a;
    }

    static int imprimeIdade(int a){

        System.out.println("Idade: " + a);
        return a;
    }

    static double imprimePeso(double a){

        System.out.println("Peso: " + a);
        return a;
    }

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        String nome;
        int idade;
        double peso;
        System.out.println("Digite um nome: ");
        nome = leitor.nextLine();
        System.out.println("Digite a idade: ");
        idade = leitor.nextInt();
        System.out.println("Digite o peso: ");
        peso = leitor.nextDouble();

        imprimeNome(nome);
        imprimeIdade(idade);
        imprimePeso(peso);
    }
}
