package desafios;

import java.util.Scanner;

public class Ds01ValidacaoBancaria {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // A validacao deve ser exata, respeitando maiusculas e minusculas.
        // Compare a entrada com os tres codigos permitidos.
        boolean operacaoValida = false;

        String operacao = scanner.nextLine();

        var deposit = "DEPOSITO";
        var plunder = "SAQUE";
        var TRANSFER = "TRANSFERENCIA";

        if (operacao.equals(deposit)){
            operacaoValida = true;

        } else if (operacao.equals(plunder)) {
            operacaoValida = true;

        } else if (operacao.equals(TRANSFER)){
            operacaoValida = true;

        } else {

        }


        // TODO: atualize a variavel operacaoValida para true se a operacao for DEPOSITO, SAQUE ou TRANSFERENCIA.

        System.out.println(operacaoValida ? "VALID" : "INVALID");

        scanner.close();
    }
}
