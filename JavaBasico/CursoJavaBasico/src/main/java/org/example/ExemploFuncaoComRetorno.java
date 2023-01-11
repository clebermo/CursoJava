package org.example;

public class ExemploFuncaoComRetorno {

    static int retorna10(){

        int a = 10;
        return a;
    }

    static double retornaQuebrado(){

        double a = 100.8;
        return a;
    }

    static char retornaLetra(){

        return 'a';
    }

    public static void main(String[] args){

        //função direto no System.out.println
        System.out.println("Retorna 10 da função: " + retorna10());

        //função retornando um valor para uma variável
        double numeroQuebrado = retornaQuebrado();
        System.out.println("Retorna número quebrado: " + numeroQuebrado);

        //retornando direto no System.out.println
        System.out.println("Retorna letra: " + retornaLetra());
    }
}
