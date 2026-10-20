package sintaxe.exercicios;

import java.util.Scanner;

public class Exercicio02AreaQuadrado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        var lado = scanner.nextInt();

        var area = Math.pow(lado, 2);
        //var area = lado * lado;

        System.out.printf("%s = %s * %s \n", area, lado, lado);
        System.out.printf("A area do quadrado é %s", area);
    }
}

/*
    Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
    fórmula: área=lado X lado
*/