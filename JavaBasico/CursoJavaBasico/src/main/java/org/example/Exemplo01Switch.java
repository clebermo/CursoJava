package org.example;

import java.util.Scanner;

public class Exemplo01Switch {

    public static void main(String[] args){

        System.out.println("1 -   Espresso:   \n");
        System.out.println("2 -   Capuccino:  \n");
        System.out.println("3 -   Macchiato:  \n");
        System.out.println("Escolha um opção: \n");

        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Espresso escolhido!");
                break;
            case 2:
                System.out.println("Capuccino escolhido!");
                break;
            case 3:
                System.out.println("Macchiato escolhido!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }
}
