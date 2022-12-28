package org.example;

import java.util.Scanner;

public class ExercicioClasseScanner {

    public static void main(String[] args) {

        // Ler valor A
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor inteiro para A: ");

        int valorA;
        int valorB;
        int valorC;

        valorA = leitor.nextInt();
        leitor.nextLine();

        // Ler valor B

        System.out.print("Digite o valor inteiro para B: ");

        valorB = leitor.nextInt();
        leitor.nextLine();


        // Ler valor C

        System.out.print("Digite o valor inteiro para C: ");

        valorC = leitor.nextInt();
        leitor.nextLine();


        System.out.println("A soma dos valores A, B e C é: " + (valorA+valorB+valorC));



    }
}
