package org.example;

public class Calculadora {

    public int soma(int x, int y){

        return x + y;
    }

    //com static depois do public e antes do tipo, pode se chamar o método diretamente
    //sem precisar criar uma instância dele
    //Exemplo: Calculadora calculadora = new Calculadora
    public static int subtracao(int x, int y){

        return x - y;
    }
}
