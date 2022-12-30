package org.example;

import java.util.Random;

public class Exemplo02Random {

    public static void main(String[] args){

        Random aleatorio = new Random();
        int min = 5;
        int max = 10;
        int numeroGerado = min + aleatorio.nextInt(max - min + 1);
        System.out.println(numeroGerado);

    }
}
