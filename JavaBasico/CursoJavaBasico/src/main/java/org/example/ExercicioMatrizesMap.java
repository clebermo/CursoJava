package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioMatrizesMap {

    public static void main(String[] args){

        /*faça um programa que leia nove valores
        numa matriz de 3x3
        e imprima esse valores na tela(três por linha)
         */

//        int[][] matriz = new int[100][200];
//        Scanner leitor = new Scanner(System.in);
//
//        for (int linha = 0; linha < 3; linha++) {
//            for (int coluna = 0; coluna < 3; coluna++) {
//
//                System.out.println("Digite um valor[" + linha + "," + coluna + "]:");
//                matriz[linha][coluna] = leitor.nextInt();
//
//            }
//        }
//        for (int linha = 0; linha < 3; linha++){
//            for (int coluna = 0; coluna < 3; coluna++){
//
//                System.out.print(matriz[linha][coluna]);
//
//            }
//            System.out.println();
//        }

        Map<Integer, Integer> map = new HashMap<>();
        Scanner leitor1 = new Scanner(System.in);

        for (int paramKey = 0; paramKey < 3; paramKey++) {
            System.out.println("Digite um valor para a linha " +paramKey+ " : ");
            map.put(paramKey, leitor1.nextInt());
        }

        for (Map.Entry<Integer, Integer> mapRetorno : map.entrySet()) {
            System.out.println("Chave do map: " + mapRetorno.getKey() + " Valor do map: " + mapRetorno.getValue());
            System.out.println("Resultado: " + mapRetorno.getValue());
        }


        Map<Integer, String> mapTest2 = new HashMap<>();
        mapTest2.put(1, "Laranja");
        mapTest2.put(2, "Banana");
        mapTest2.put(3, "Melancia");

        for (Map.Entry<Integer, String> resultadoTest2 : mapTest2.entrySet()) {
            System.out.println("chave do map: " + resultadoTest2.getKey() + " valor do map: " + resultadoTest2.getValue());
            System.out.println("resultado: " + resultadoTest2.getValue());
        }

        Map<Integer, Integer> novoMap = new HashMap<>();
        Scanner leitor2 = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite um valor: ");
            novoMap.put(i, leitor2.nextInt());
        }
            for (Map.Entry<Integer, Integer> mapRetorno2 : novoMap.entrySet()) {
                System.out.println("chave do map: " + mapRetorno2.getKey() + " valor do map: " + mapRetorno2.getValue());
                System.out.println("resultado: " + mapRetorno2.getValue());


        }


    }
}
