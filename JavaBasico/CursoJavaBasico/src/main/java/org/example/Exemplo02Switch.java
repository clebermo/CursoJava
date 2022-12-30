package org.example;

import java.util.Scanner;

public class Exemplo02Switch {

    public static void main(String[] args){

        System.out.println("a -   Espresso:   \n");
        System.out.println("b -   Capuccino:  \n");
        System.out.println("c -   Macchiato:  \n");
        System.out.println("Escolha um opção: \n");

        Scanner leitor = new Scanner(System.in);
        String opcao = leitor.next();

        switch (opcao) {
            case "a" -> System.out.println("Espresso escolhido!");
            case "b" -> System.out.println("Capuccino escolhido!");
            case "c" -> System.out.println("Macchiato escolhido!");
            default -> System.out.println("Opção inválida!");
        }

    }
}
