package org.example;

public class ExemploEscopo {

    static String saudacao = "Bom dia";

    //quando crio funções que serão chamadas na main
    //preciso que elas também sejam Static
    //pois a Main em si não é um objeto
    static void imprimeSaudacao(){
        //imprime a mensagem de acordo com o momento
        System.out.println(saudacao);
    }

    public static void main(String[] args){

        imprimeSaudacao();
        //muda a mensagem
        saudacao = "Boa noite";
        imprimeSaudacao();
    }
}
