package orientacaoobjeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //cria um objeto Cookie chamado c
        Cookie c = new Cookie();

        //altera seus atributos
        c.sabor = "Chocolate";
        c.preco = 2.50;

        //imprime seus atributos
        System.out.println("O cookie c é de " + c.sabor);
        System.out.println("O cookie c custa R$ " + c.preco);

        //atualizando o sabor do Cookie
        System.out.println("Digite um novo sabor: ");
        Scanner leitor = new Scanner(System.in);
        c.sabor = leitor.nextLine();
        System.out.println("Novo sabor: " + c.sabor);

    }
}
