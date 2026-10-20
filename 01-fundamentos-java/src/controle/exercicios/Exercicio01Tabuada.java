package controle.exercicios;

import java.util.Scanner;

public class Exercicio01Tabuada {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("===TABUADA 10x===");
        System.out.println("Digite um número: ");
        var numInput = scanner.nextInt();

        System.out.println("=================");
        for (var i = 1; i < 11 ; i++){
            System.out.printf("%s * %s = %s\n", i, numInput, i * numInput);
        }

        System.out.println("=================");
        System.out.println("Fim da execução");


    }
}

/*
    Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
 */