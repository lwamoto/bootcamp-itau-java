package sintaxe.exercicios;

import java.util.Scanner;

public class Exercicio03AreaRetangulo {

    private static final String MESSAGE = "A area do retângulo é %s\n";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retângulo: ");
        var base = scanner.nextFloat();

        System.out.println("Digite a altura do retângulo: ");
        var altura = scanner.nextFloat();

        var area = base * altura;

        System.out.printf("%s = %s * %s \n", area, base, altura);
        System.out.printf(MESSAGE, area);
    }
}
/*
    Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
    fórmula: área=base X altura
*/