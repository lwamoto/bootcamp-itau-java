package classesencapsulamento.exercicios.contabancaria;

import java.util.Scanner;

public class Exercicio01ContaBancaria {
    static void showResult(boolean ok, String successMenssage, String errorMensage){
        System.out.println(ok? successMenssage : errorMensage);
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var repeticao = false;
        boolean ok;
        //Definindo o primeiro deposito
        System.out.println("Valor primeiro Deposito:");
        var valueFirst = scanner.nextDouble();
        //Chamando o construtor com o valor do deposito
        ContaBancaria japa = new ContaBancaria(valueFirst);
        while (!repeticao){
            //System.out.println("Como podemos ajudar: ");
            System.out.println("0 Sair");
            System.out.println("1 Consultar saldo");
            System.out.println("2 Consultar cheque especial");
            System.out.println("3 Depositar dinheiro");
            System.out.println("4 Saque dinheiro");
            System.out.println("5 Pagar boletos");
            System.out.println("6 Verificar cheque especial");
            var opcao = scanner.nextInt();

            switch(opcao) {
                case 0:
                    return;
                case 1:
                    double saldo = japa.getBalance();
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double chequeEspecial = japa.getOverDraftLimit();
                    System.out.println("O cheque atual: "+ chequeEspecial);
                    break;
                case 3:
                    System.out.println("Digite o valor do deposito: ");
                    double deposito = scanner.nextDouble();
                    ok = japa.deposit(deposito);

                    showResult(
                            ok,
                            "Deposito Realizado!",
                            "Valor Inválido."
                    );
                    break;
                case 4:
                    System.out.println("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();
                    ok = japa.withdraw(saque);

                    showResult(
                            ok,
                            "Saque Realizado!",
                            "Saque Inválido."
                    );
                    break;
                case 5:
                    System.out.println("Digite o valor do boleto: ");
                    double boleto = scanner.nextDouble();
                    ok = japa.payBill(boleto);

                    showResult(ok,
                            "Pagamento Realizado!",
                            "Pagamento Falhou."
                            );
                    break;
                case 6:
                    ok = japa.isUsingOverdraft();

                    showResult(
                            ok,
                            "Está Ativo!",
                            "Está Inativo."
                    );
                    break;
                default:
                    System.out.println("Inválido.");
                    break;
            }



        }








    }
}
