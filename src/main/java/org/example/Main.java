package org.example;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println("Soma: " + calculadora.soma(10, 20));
        System.out.println("Subtração: " + Calculadora.subtracao(10, 5));
    }
}