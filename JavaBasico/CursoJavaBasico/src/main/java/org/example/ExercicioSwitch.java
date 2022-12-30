package org.example;

import java.util.Scanner;

public class ExercicioSwitch {

    public static void main(String[] args){

        System.out.println("1- Domingo \n");
        System.out.println("2- Segunda \n");
        System.out.println("3- Terça \n");
        System.out.println("4- Quarta \n");
        System.out.println("5- Quinta \n");
        System.out.println("6- Sexta \n");
        System.out.println("7- Sábado \n");
        System.out.println("Escolha o dia da semana: \n");

        Scanner leitor = new Scanner(System.in);
        int escolha = leitor.nextInt();


        switch (escolha){
            case 1:
                System.out.println("É Domingo!");
                break;
            case 2:
                System.out.println("É Segunda!");
                break;
            case 3:
                System.out.println("É Terça!");
                break;
            case 4:
                System.out.println("É Quarta!");
                break;
            case 5:
                System.out.println("É Quinta!");
                break;
            case 6:
                System.out.println("É Sexta!");
                break;
            case 7:
                System.out.println("É Sábado!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;

        }

    }
}
