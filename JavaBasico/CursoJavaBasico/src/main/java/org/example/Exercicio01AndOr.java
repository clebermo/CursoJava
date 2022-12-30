package org.example;

import java.util.Scanner;

public class Exercicio01AndOr {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        double numero;

        System.out.print("Digite o número: ");
        numero = leitor.nextDouble();
        leitor.nextLine();


        if (numero > 5 && numero < 20) {
            System.out.println("O número está entre 5 e 20!");
             }
        else {
            System.out.println("O número não está entre 5 e 20!");
        }

    }
}
