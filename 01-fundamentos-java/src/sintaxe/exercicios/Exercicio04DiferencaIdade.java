package sintaxe.exercicios;

import java.util.Scanner;

public class Exercicio04DiferencaIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var name1 = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        var age1 = scanner.nextInt();
        scanner.nextLine();
        //Enquanto testava o codigo me deparei com um bug do Enter fantasma
        //consigui entender que após usar o nextInt(), acaba lendo apenas o numero digitado
        //e deixa \n para trás, que espera outro next para ler uma linha vazia.
        //Para resolver esse bug, devemos apenas adicionar um scanner.nextLine() para limpar esse \n
        //que sobrou do nextInt(), assim impedindo a leitura de uma linha vazia

        System.out.println("Digite seu nome: ");
        var name2 = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        var age2 = scanner.nextInt();

        var difference = Math.abs(age1 - age2);
        //O math.abs, basicamente vai deixar o resultado positivo mesmo que o primeiro valor de age
        //seja menor que o segundo, impedindo numeros negativos como resultado.

        System.out.printf("%s tem %s anos\n", name1, age1);
        System.out.printf("%s tem %s anos\n", name2, age2);

        System.out.printf("A diferença de idade entre eles é de %s - %s = %s\n", age1, age2, difference);


    }
}
/*
    Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
*/