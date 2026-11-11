package interfaceslambda.figuras;

import java.util.Locale;

public class Exercicio03Figuras {

    public static void main(String[] args) {
        Quadrado square = new Quadrado(5);
        Retangulo rectangle = new Retangulo(4, 10);
        Circulo circle = new Circulo(3.5);

        System.out.println("A area do quadrado: " + square.calculateArea());
        System.out.println("A area do retângulo: " + rectangle.calculateArea());
        System.out.printf(Locale.US,"A area do circulo: %.2f%n",circle.calculateArea());
    }
}

