package controle.exercicios;

import java.util.Scanner;

public class Exercicio02CalculoIMC {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("=============");
        System.out.println("Sistema IMC");
        System.out.println("Digite a sua altura: ");
        var userHeight = scanner.nextFloat();

        System.out.println("Digite o seu peso: ");
        var userWeight = scanner.nextFloat();

        var calcIMC = userWeight / (userHeight * userHeight);
        
        if (calcIMC <= 18.5) {
            System.out.println("Abaixo do peso");

        } else if ((calcIMC >= 18.6 && calcIMC <= 24.9 )) {
            System.out.println("Peso ideal");

        } else if(calcIMC >= 25.0 && calcIMC <= 29.9){
            System.out.println("Levemente acima do peso");

        } else if (calcIMC >= 30.0 && calcIMC <= 34.9) {
            System.out.println("Obesidade Grau I");

        }else if (calcIMC >=35.0 && calcIMC <= 39.9){
            System.out.println("Obesidade Grau II (Severa)");

        } else if (calcIMC >= 40.0) {
            System.out.println("Obesidade III (Mórbida)");
        }
    }
}

/*
Escreva um código onde o usuário entra com sua altura e peso,
seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

Se for menor ou igual a 18,5 "Abaixo do peso";
se for entre 18,6 e 24,9 "Peso ideal";
Se for entre 25,0 e 29,9 "Levemente acima do peso";
Se for entre 30,0 e 34,9 "Obesidade Grau I";
Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
*/