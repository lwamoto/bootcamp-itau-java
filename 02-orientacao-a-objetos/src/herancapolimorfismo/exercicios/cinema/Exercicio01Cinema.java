package herancapolimorfismo.exercicios.cinema;

import java.util.Scanner;

public class Exercicio01Cinema {

    public static void main(String[] args) {
        //Ingresso ingresso = new Ingresso();
        //IngressoFamilia ingressoFamilia = new IngressoFamilia();
        //MeiaEntrada meiaEntrada = new MeiaEntrada();
        var scanner = new Scanner(System.in);final double BASE_PRICE = 30;

        System.out.println("Cinema: ");
        System.out.println("Selecione o ingresso: ");
        System.out.println("1 Meia | 2 Ingresso | 3 Ingresso Familia");
        var tipo = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o filme: ");
        var filme = scanner.nextLine();

        System.out.println("Escolha a versão do filme: ");
        System.out.println("1 Dublado | 2 Legendado");
        var versao = scanner.nextInt();
        boolean dublado  = (versao == 1);

        Ingresso ingresso;

        switch (tipo){
            case 1-> ingresso = new MeiaEntrada(BASE_PRICE, filme, dublado);
            case 2-> ingresso = new Ingresso(BASE_PRICE, filme, dublado);
            case 3->{
                System.out.println("Quantas pessoas: ");
                var qtdPessoas = scanner.nextInt();

                ingresso = new IngressoFamilia(BASE_PRICE, filme, dublado, qtdPessoas);
            }
            default -> {
                System.out.println("Inválido.");
                return;
            }

        }

        System.out.println(ingresso.getRealPrice());
    }


}
