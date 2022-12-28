package org.example;

import java.util.Scanner;

public class ExemploEqualsString {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        String palavraA;
        String palavraB;

        System.out.print("Digite a primeira palavra: ");
        palavraA = leitor.nextLine();
        System.out.print("Digite a segunda palavra: ");
        palavraB = leitor.nextLine();

        if (palavraA.equals(palavraB)) {
            System.out.println("Palavras iguais!");
        } else {
            System.out.println("Palavras diferentes!");
        }
    }
}
