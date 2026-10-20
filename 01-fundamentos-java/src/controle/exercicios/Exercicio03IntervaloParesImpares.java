package controle.exercicios;

import java.util.Scanner;

public class Exercicio03IntervaloParesImpares {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        var numFirst = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        var numSecond = scanner.nextInt();

        System.out.println("Você deseja par ou ímpar");
        System.out.println("Digite: P to Par ou I to Ímpar");
        var isPar = scanner.next().equalsIgnoreCase("p");

        var valueMax = Math.max(numFirst, numSecond);
        var valeuMin = Math.min(numFirst, numSecond);
        if (isPar){
            for (var i = valueMax; valeuMin <= i; --i){
                if (i%2!=0) continue; System.out.printf("O número %s é par \n",i);
            }
        }

        if (!isPar) for(var i = valueMax; valeuMin <= i; --i){
            if (i%2==0) continue; System.out.printf("O número %s é Ímpar \n",i);
        }
    }

}
/*
Escreva um código que o usuário entre com um primeiro número,
um segundo número maior que o primeiro e escolhe entre a opção par e impar,
com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
no intervalo de números informados, incluindo os números informados e em ordem decrescente;
*/
