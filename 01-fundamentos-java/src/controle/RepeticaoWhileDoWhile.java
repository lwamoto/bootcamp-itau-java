package controle;

import java.util.Scanner;

public class RepeticaoWhileDoWhile {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        //var name = "";
        /*
        while (true){
            System.out.println("Infome um nome: ");
            name = scanner.next();
            System.out.println(name);

            if (name.equalsIgnoreCase("exit")) break;

         */
        /*
        var name = "exit";
        do {
            System.out.println("Infome um nome: ");
            name = scanner.next();
            System.out.println(name);

        }while (!name.equalsIgnoreCase("exit"));
        */
        /*
        O Do While roda o código e após isso verifica a variavel
        O While verifica a variavel antes de rodar o código
         */


        var i = 0;
        while (args.length > i){
            System.out.println("Esse é WHILE");
            System.out.println(args[i]);
            i++;
        }


        System.out.println("===========================================================");

        i=0;

        do {
            System.out.println("Esse é DO WHILE");
            System.out.println(args[i]);
            i++;
        }while (args.length>i);



    }
}
