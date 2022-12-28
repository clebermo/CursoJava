package org.example;

import java.util.Scanner;

public class ExemploIfeElseIfeElse {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.print("Digite sua idade: ");
        idade = leitor.nextInt();

        if (idade == 18) {
            System.out.println("Você precisa se alistar!");
        } else if (idade > 18) {
            System.out.println("Você já se alistou!");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }
}
