package org.example;

import java.util.Scanner;

public class ExercicioVetor02 {

    public static void main(String[] args){

        //faça um programa que leia 5 números
        //e adicione-os num array(vetor)
        //depois quando o usuário digitar um número para ser buscado
        //informe se ele está ou não no array(vetor)

        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[5];
        boolean foiEncontrado = false;

        vetor[0] = leitor.nextInt();
        vetor[1] = leitor.nextInt();
        vetor[2] = leitor.nextInt();
        vetor[3] = leitor.nextInt();
        vetor[4] = leitor.nextInt();

        System.out.println("Digite um número:");
        int valorBuscado = leitor.nextInt();

        for (int i = 0; i < 5; i++) {

            if (vetor[i] == valorBuscado) {
                foiEncontrado = true;
                break;
            }
        }

        if (foiEncontrado){
            System.out.println("O número está no array!");
        }else {
            System.out.println("O número não está no array!");
        }

    }
}
