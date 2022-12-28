package org.example;

import java.util.Scanner;

public class ConversaoUsandoParse {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro peso:");
        String peso = leitor.nextLine();
        double metadePeso = Double.parseDouble(peso) / 2;

        System.out.print("Digite o segundo peso: ");
        int pesoB = leitor.nextInt();
        leitor.nextLine();
        String metadePesoB = String.valueOf(pesoB/2);

        System.out.print("Digite o terceiro peso: ");
        String pesoC = leitor.next();
        int metadePesoC = Integer.parseInt(pesoC) / 2;


        System.out.println("Metade do peso: " + metadePeso + "kg");
        System.out.println("Metade do peso B: " + metadePesoB + "kg");
        System.out.println("Metade do peso C: " + metadePesoC + "kg");


    }

}
