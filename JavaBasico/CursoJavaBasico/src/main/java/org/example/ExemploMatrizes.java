package org.example;

import java.util.Scanner;

public class ExemploMatrizes {

    public static void main(String[] args){

        //define a matriz
        int[][] matriz = {{1,2,3},{4,5,6}};

        //lendo novos valores para a matriz
        Scanner leitor = new Scanner(System.in);

        //percorre a matriz
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                //lê o valor de cada posição
                matriz[i][j] = leitor.nextInt();
            }
            //pula uma linha
            System.out.println();
        }
        /*
         * 1 vez: i = 0
         *    1 vez j = 0 -> Lê o valor para [0][0]
         *    2 vez j = 1 -> Lê o valor para [0][1]
         *    3 vez j = 2 -> Lê o valor para [0][2]
         * 2 vez: i = 1
         *    1 vez j = 0 -> Lê o valor para [1][0]
         *    2 vez j = 1 -> Lê o valor para [1][1]
         *    3 vez j = 2 -> Lê o valor para [1][2]
         */
        //percorre a matriz
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                //imprime o valor de cada posição
                System.out.print(matriz[i][j]);
            }
            //pula uma linha
            System.out.println();
        }

    }
}
