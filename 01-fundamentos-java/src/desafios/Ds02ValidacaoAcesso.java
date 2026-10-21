package desafios;

import java.util.Scanner;

public class Ds02ValidacaoAcesso {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String codigoInformado = scanner.nextLine();
        String codigoEsperado = scanner.nextLine();

        // Compare os dois textos exatamente como foram lidos.
        // Se forem identicos, exiba "ACESSO LIBERADO"; caso contrario, "ACESSO NEGADO".
        // TODO: imprima o resultado da validacao em uma unica linha.

        var isEquals = false;

        if (codigoInformado.equals(codigoEsperado)) isEquals = true; else;

        System.out.println(isEquals ? "ACESSO LIBERADO" : "ACESSO NEGADO");

    }
}
