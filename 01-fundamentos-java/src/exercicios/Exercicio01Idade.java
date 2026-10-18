package exercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Exercicio01Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var name = scanner.nextLine();
        //Descobri que o scanner.next() lê apenas uma frase, e caso você digita 2 ou mais, ele guardará apenas
        //a primeira e dará continuidade a linha de codigo deixando a segunda frase na fila, o que faz o codigo
        //dar erro de transformação, já que string não pode virar data, nesse contexto.
        //Para solucionar esse problema basta apenas usar o nextLine();

        System.out.println("Digite a sua data de nasimento no serguinte forato: dd/MM/YYYY");
        var data = scanner.next();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(data, formato);

        var age = Period.between(nascimento, LocalDate.now()).getYears();

        System.out.printf("Olá %s você tem %s anos!", name, age);

    }
}

/*
    Escreva um código que receba o nome e o ano de nascimento de alguém e
    imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
*/
