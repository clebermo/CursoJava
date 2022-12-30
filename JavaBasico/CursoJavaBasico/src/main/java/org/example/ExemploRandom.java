package org.example;

import java.util.Random;

public class ExemploRandom {

    public static void main(String[] args){

        // Faça um código que gere um número aleatório de 0 a 10
        Random aleatorio = new Random();

        /*
         no parentêses fica o valor do limite +1
         neste exemplo, o limite é 10
         então 10+1, fica 11
         para o cálculo do valor máximo do limite, o java subtraí 1 do valor entre parentêses
         neste caso, o 11, o java entende que o valor aleatório é gerado do 0 ao 10
        */
        System.out.println(aleatorio.nextInt(11));

    }
}
