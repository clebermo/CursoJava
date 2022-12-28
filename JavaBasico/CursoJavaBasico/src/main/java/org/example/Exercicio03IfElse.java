package org.example;

import java.util.Scanner;

public class Exercicio03IfElse {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        String palavra;

        System.out.print("Digite uma palavra: ");
        palavra = leitor.nextLine();

        if (palavra.length() == 5) {
            System.out.println("A palavra tem 5 letras!");
        } else if (palavra.length() > 5) {
            System.out.println("A palavra tem mais de 5 letras!");
        } else {
            System.out.println("A palavra tem menos de 5 letras!");
        }

    }
}
