package org.example;



public class ExercicioWhile {

    public static void main(String[] args){

        /* faça um programa que imprima a soma dos 10 primeiros números naturais
        que são de 0 á 9
         */

        int nat = 0;
        int soma = 0;

        while (nat < 10){

            System.out.println("A soma atual é: " + soma);
            System.out.println("O valor atual de nat e: " + nat);

            soma = soma + nat;
            System.out.println("O valor atual da soma é: " + soma);
            System.out.println();

            nat++;

        }
        System.out.println("A soma dos 10 primeiros números naturais é: " + soma);

    }
}
