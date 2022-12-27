package org.example;

import java.util.Scanner;

public class LeitorIdade {

    public static void main(String[] args){

        // Ler idade
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma idade: ");

        int idade = leitor.nextInt();
        leitor.nextLine();

        // Ler sexo

        System.out.println("Digite o sexo: ");

        String sexo = leitor.nextLine();



        // Ler altura

        System.out.println("Digite a altura: ");

        double altura = leitor.nextDouble();
        leitor.nextLine();

        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Altura: " + altura);

    }
}
