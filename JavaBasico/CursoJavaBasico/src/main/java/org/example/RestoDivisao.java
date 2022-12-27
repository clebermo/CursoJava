package org.example;

public class RestoDivisao {

    public static void main(String[] args) {

        double a = 3.2;
        double b = 1.5;

        double resultado = a / b;
        double restoDivisao = a % b;

        System.out.println("O resultado da divisão é:" + resultado);
        System.out.println("E o resto da divisão é:" + String.format("%.2f", restoDivisao));
    }
}
