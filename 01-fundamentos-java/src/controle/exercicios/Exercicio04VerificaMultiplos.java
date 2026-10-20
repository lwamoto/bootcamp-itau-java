package controle.exercicios;

import java.util.Scanner;

public class Exercicio04VerificaMultiplos {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        var numFirst = scanner.nextFloat();

        System.out.println("Agora você vai digitar um número que divida o primeiro e de resto 0");
        System.out.println("======================");

        var condition = false;
        do {
            System.out.println("Digite um numero: ");
            var numSecond = scanner.nextFloat();

            if (numSecond <= numFirst) continue; {

                if (numSecond % numFirst !=0) {
                    condition = true;
                }
            }

        } while(!condition);

    }
}
/*
Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números,
a execução do código irá continuar até que o número informado dividido
pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
*/