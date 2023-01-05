package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArraylist {

    public static void main(String[] args){

        //cria um arraylist sem informar tamanho, pois ele se adapta
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();

        //adiciona um valor
        listaDeNumeros.add(15);

        //Adiciona um valor que foi digitado pelo usuário
        Scanner leitor = new Scanner(System.in);
        listaDeNumeros.add(leitor.nextInt());

        //pegar um valor de uma posição no arraylist e imprimir na tela
        System.out.println(listaDeNumeros.get(0));

        //como saber o tamanho atual de um arraylist
        //listaDeNumeros.size();

        //como percorrer um arraylist
        /* for (int i=0; i<listaDeNumeros.size(); i++){
        System.out.println(listaDeNumeros.get(i));
         */
        for (Integer listaDeNumero : listaDeNumeros) {
            System.out.println(listaDeNumero);
        }

        //esvaziando
        listaDeNumeros.clear();

    }
}
