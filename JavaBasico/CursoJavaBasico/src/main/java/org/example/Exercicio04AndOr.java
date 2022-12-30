package org.example;

import java.util.Scanner;

public class Exercicio04AndOr {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = leitor.nextInt();
        leitor.nextLine();

        if ( (num1 > 10 && num2 > 10) || (num1 < 10 || num2 < 10) ){
            System.out.println("Os dois números são maiores que 10, ou pelo menos um deles é menor que 10!");
        }

    }
}
