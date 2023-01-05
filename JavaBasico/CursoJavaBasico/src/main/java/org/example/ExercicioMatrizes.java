package org.example;

import java.util.Scanner;

public class ExercicioMatrizes {

    public static void main(String[] args){

        /*faça um programa que leia nove valores
        numa matriz de 3x3
        e imprima esse valores na tela(três por linha)
         */

        int[][] matriz = new int[3][3];
        Scanner leitor = new Scanner(System.in);

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {

                System.out.println("Digite um valor[" + linha + "," + coluna + "]:");
                matriz[linha][coluna] = leitor.nextInt();

            }
        }
        for (int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){

                System.out.print(matriz[linha][coluna]);

            }
            System.out.println();
        }

    }
}
