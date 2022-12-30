package org.example;

import java.util.Scanner;

public class Exercicio03AndOr {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();
        leitor.nextLine();

        if (num1 > 10 || num2 > 10){
            System.out.println("Um ou os dois números digitados é(são) maior que 10!");
            }
        else {
            System.out.println("Nenhum dos números digitados é maior que 10!");
            }



    }


}
