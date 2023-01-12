package org.example;

import java.util.Scanner;

public class ExemploFuncaoComParametro {

    static void imprimeSoma(int a, int b){

        System.out.println("Soma: " + (a+b));
    }

    static double retornaSoma(int a, int b){

        int soma = a+b;
        return soma;
    }

    static double retornaComMais10(double a){

        return a+10.0;
    }

    public static void main(String[] args){

        //enviando para imprimir
        int valor1;
        int valor2;
        System.out.println("Insira dois valores inteiros");
        Scanner leitor = new Scanner(System.in);
        valor1 = leitor.nextInt();
        valor2 = leitor.nextInt();
        imprimeSoma(valor1, valor2);

        //retornando a soma
        System.out.println("Soma: " + retornaSoma(10, 20));

        //função retornando um valor para uma variável
        double valorFinal = retornaComMais10(5.3);
        System.out.println("Número quebrado: " + valorFinal);
    }
}
