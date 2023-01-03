package org.example;

import java.util.Scanner;

public class ExercicioWhile03 {

    public static void main(String[] args){

        //faça um programa que leia dois números
        //e imprima todos os números inteiros entre eles

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = leitor.nextInt();


        System.out.println("Digite o segundo número");
        int num2 = leitor.nextInt();

        int contadorMais = num1 + 1;
        int contadorMenos = num1 - 1;

        while (contadorMais < num2){

            System.out.println("Os números inteiros entre " + num1 + " e " + num2 + " são:" + contadorMais);
            contadorMais++;


        }

        while (contadorMenos > num2){

            System.out.println("Os números inteiros entre " + num1 + " e " + num2 + " são:" + contadorMenos);
            contadorMenos--;


        }

    }
}
