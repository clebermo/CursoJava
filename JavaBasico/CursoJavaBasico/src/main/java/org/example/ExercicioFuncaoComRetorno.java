package org.example;

import java.util.Scanner;

public class ExercicioFuncaoComRetorno {

    //faça um programa que leia um idioma selecionado numericamente
    //e exiba "bom dia" ou "buenos dias"
    //através de funções com retorno

    static String saudacaoPortugues(){

        return "Bom dia!";
    }

    static String saudacaoEspanhol(){

        return "Buenos dias!";
    }

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("1- Português");
        System.out.println("2- Espanhol");
        int idioma = leitor.nextInt();

        switch (idioma){

            case 1:
                System.out.println(saudacaoPortugues());
                break;
            case 2:
                System.out.println(saudacaoEspanhol());
                break;
            default:
                System.out.println("Opção inválida!");

        }
    }

}
