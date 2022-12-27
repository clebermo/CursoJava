package org.example;

import java.util.Scanner;

public class ExercicioClasseScanner {

    public static void main(String[] args) {

        // Ler valor A
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor A: ");

        int valorA = leitor.nextInt();
        leitor.nextLine();

        // Ler valor B

        System.out.println("Digite o valor B: ");

        float valorB = Float.parseFloat(leitor.nextLine());
        leitor.nextLine();


        // Ler valor C

        System.out.println("Digite o valor C: ");

        double valorC = leitor.nextDouble();
        leitor.nextLine();

        System.out.println("Idade: " + valorA);
        System.out.println("Sexo: " + valorB);
        System.out.println("Altura: " + valorC);


    }
}
