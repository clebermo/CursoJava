package org.example;

import java.util.Scanner;

public class ExemploIfElse {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.print("Digite sua idade: ");
        idade = leitor.nextInt();

        if (idade > 17) {
            System.out.println("Você é maior de idade!");
        }
        else {
            System.out.println("Você é menor de idade!");
        }
    }

}
