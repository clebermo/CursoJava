package org.example;

public class ExemploWhile02 {

    public static void main(String[] args){

        int a = 10;

        do {
            System.out.println("Vai ser executado ao menos uma vez");
            System.out.println("Mesmo que a condição seja falsa");

        }
        while (a < 5);

    }
}
