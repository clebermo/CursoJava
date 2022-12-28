package org.example;

import java.util.Scanner;

public class Exercicio01IfElse {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite o segundo número: ");
        numero2 = leitor.nextInt();
        leitor.nextLine();

        if ((numero1+numero2) > 10) {
            System.out.println("A soma dos números é maior que 10!");
            System.out.println("A soma é: " + (numero1+numero2));
        }
        else {
            System.out.println("A soma dos números é menor que 10!");
        }

    }
}
