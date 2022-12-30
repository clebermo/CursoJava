package org.example;

import java.util.Scanner;

public class Exercicio02AndOr {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        double numero;

        System.out.print("Digite o número: ");
        numero = leitor.nextDouble();
        leitor.nextLine();


        if (numero < 5 || numero > 10) {
            System.out.println("O número é menor que 5 ou maior que 10!");
        }
        else {
            System.out.println("O número não é menor que 5 ou maior que 10!");
        }

    }
}
