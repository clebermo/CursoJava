package org.example;

import java.util.Scanner;

public class ExercicioWhile02 {

    public static void main(String[] args){

        /* faça um programa que leia um número e multiplique o resultado por 2
        até o número passar 100
         */

        Scanner leitor = new Scanner(System.in);
        int valor = 0;


                while (valor < 1 || valor > 100){

                    System.out.println("Digite um valor de 1 a 100");
                    valor = leitor.nextInt();
                }


                while (valor < 100){

                    System.out.println("O valor multiplicado é: " + valor);
                    valor = valor * 2;

                }

    }
}
