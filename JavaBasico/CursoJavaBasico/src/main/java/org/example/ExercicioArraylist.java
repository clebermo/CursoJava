package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArraylist {

    public static void main(String[] args){

        //faça um programa que adicione números inteiros num arraylist
        //até o número digitado ser -1
        //depois imprima o arraylist lido na tela
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> numeroDigitado = new ArrayList<>();
        int valorLido = 0;

        while (valorLido != -1){
            System.out.println("Digite -1: ");
            valorLido = leitor.nextInt();
            if (valorLido != -1) {
                numeroDigitado.add(valorLido);
            }

        }
        /*for(int i = 0; i < numeroDigitado.size(); i++){
            System.out.println(numeroDigitado.get(i));
        }*/
        for (Integer integer : numeroDigitado) {
            System.out.println(integer);
        }

    }
}
