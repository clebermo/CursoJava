package org.example;

import java.util.Scanner;

public class ExercicioExemploFuncaoComParametro {

    //faça um programa que leia um nome, idade e peso
    //e imprima na tela as informações da seguinte forma:
    /*Nome:
      Idade:
      Peso:
     */

    static void imprimeDetalhesPessoa(String nome, int idade, double peso) {

        System.out.println(" ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //lê o nome
        System.out.println("Digite um nome: ");
        String nome = leitor.nextLine();

        //lê a idade
        System.out.println("Digite a idade: ");
        int idade = leitor.nextInt();

        //lê o peso
        System.out.println("Digite o peso: ");
        double peso = leitor.nextDouble();

        //chama a função para imprimir tudo na tela
        imprimeDetalhesPessoa(nome, idade, peso);
    }

}
