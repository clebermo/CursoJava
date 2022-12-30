package org.example;

import java.util.Random;

public class ExercicioRandom {

    public static void main(String[] args){

        Random aleatorio = new Random();
        int min = 1;
        int max = 6;
        int numeroGerado1 = min + aleatorio.nextInt(max - min + 1);
        int numeroGerado2 = min + aleatorio.nextInt(max - min + 1);

        if (numeroGerado1 * numeroGerado2 > 15){
            System.out.println("A multiplicação entre os números é maior que 15!");
        }else {
            System.out.println("A multiplicação é menor que 15!");
        }


    }
}
