package controle;

import java.util.Scanner;

public class CondicionalIfElse {


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();

        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();

        System.out.println("Você é emancipado: (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("S" + "N");

        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);

        //UTILIZANDO ELVIS OPERATOR
        var message = canDrive ?
                name + ", você pode dirigir \n":
                name + ", você não pode dirigir \n";


        /* UTILIZANDO COM IF ELSE
        var message = "";
        if (canDrive)
            message = name + ", você pode dirigir \n";

        else message = name + ", você não pode dirigir \n";
         */


        System.out.println(message);
        System.out.println("Fim da execução!");

    }
}
