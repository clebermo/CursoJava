package org.example;

import java.util.Scanner;

public class ExercicioLerNomeSobrenome {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);


        System.out.print("Digite o nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o sobrenome: ");

        String sobrenome = leitor.nextLine();

        System.out.println("O nome digitado é: " + nome + " " + sobrenome);



    }

}
