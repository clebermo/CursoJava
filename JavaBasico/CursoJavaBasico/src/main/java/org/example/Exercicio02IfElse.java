package org.example;

import java.util.Scanner;

public class Exercicio02IfElse {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int numero1;

        System.out.print("Digite um número: ");
        numero1 = leitor.nextInt();
        leitor.nextLine();

        if (numero1 % 2 > 0) {
            System.out.println("O número é ímpar!");
            }
        else {
            System.out.println("O número é par!");
        }

    }
}
