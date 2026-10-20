package controle;

import java.util.Scanner;

public class CondicionalSwitchCase {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um num de 1 até 7");
        var option = scanner.nextInt();
        /*
        switch (option) {
            case 1: case 7:
                //System.out.println("Dom");

                System.out.println("Final de semana!!");
                break; //KeyWord
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;

            case 7:
                System.out.println("Sab");
                break;

            default:
                System.out.println("Opção inválida!");
        */

        // Segunda forma de utilizar o Switch
        /*
        switch (option){
            case 1, 7 -> System.out.println("Final de semana!!!");
            // System.out.println("Dom");
            case 2 -> System.out.println("Seg");
            case 3 -> System.out.println("Ter");
            case 4 -> System.out.println("Qua");
            case 5 -> System.out.println("Qui");
            case 6 -> System.out.println("Sex");
            //case 7 -> System.out.println("Sab");
            default -> System.out.println("Opção inválida!");
        };
        */

        //Terceira forma de utilizar o Switch
        var message = switch (option){
            case 1, 7 -> {
                var day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana!!!!, ",day);

            }
            case 2 -> "Seg";
            case 3 -> "Ter";
            case 4 -> "Qua";
            case 5 -> "Qui";
            case 6 -> "Sex";
            //case 7 -> Sab";
            default -> "Opção inválida!";
        };
        System.out.println(message);

    }
}
