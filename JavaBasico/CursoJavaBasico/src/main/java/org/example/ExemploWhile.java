package org.example;

import java.util.Scanner;

public class ExemploWhile {

    public static void main(String[] args){

        int a = 0;

        while (a < 1 || a > 6){

            System.out.println("Digite entre 1 e 6!");
            Scanner leitor = new Scanner(System.in);
            a = leitor.nextInt();

        }
        System.out.println("Concluído!");

    }
}
