package classes_encapsulamento.exercicios.carro;

import java.util.Scanner;

public class Exercicio02Carro {

    static void showResult(boolean ok, String sM, String eM){
        System.out.println(ok? sM : eM);
    }
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        Carro bmw = new Carro();

        boolean ok;
        while (true){
            System.out.println("Carro: ");
            System.out.println("0 Sair | 1 Ligar carro | 2 Desligar carro");
            System.out.println("3 Acelerar | 4 Freiar | 5 Trocar marcha");
            System.out.println("6 Verificar marcha | 7 Verificar velocidade");
            System.out.println("8 Virar esquerda | 9 Virar direita" );
            var o = scanner.nextInt();

            switch (o){
                case 0:
                    return;
                case 1:
                    ok = bmw.turnOn();

                    showResult(ok,
                            "Sucesso, carro ligado!",
                            "Erro ao ligar.")
                    ;
                    break;
                case 2:
                    ok = bmw.turnOff();

                    showResult(ok,
                            "Sucesso, carro desligado!",
                            "Erro ao desligar.")
                    ;
                    break;
                case 3:
                    ok = bmw.accelerate();

                    showResult(ok,
                            "Sucesso, ao acelerar!",
                            "Erro, ao acelerar.")
                    ;
                    break;
                case 4:
                    ok = bmw.decelerate();

                    showResult(ok,
                            "Sucesso, ao desacelerar!",
                            "Erro, ao desacelerar.")
                    ;
                    break;
                case 5:
                    System.out.println("Digite a marcha: ");
                    int numMarcha = scanner.nextInt();
                    ok = bmw.changeGear(numMarcha);

                    showResult(ok,
                            "Sucesso, ao alterar marcha!",
                            "Erro, ao alterar marcha."
                    );
                    break;
                case 6:
                    int marcha = bmw.getGear();

                    System.out.printf("Marcha: %d\n", marcha);
                    break;
                case 7:
                    int velocidade = bmw.getSpeed();

                    System.out.printf("Velocidade: %d km/h\n", velocidade);
                    break;
                case 8:
                    ok = bmw.turnLeft();

                    showResult(ok,
                            "Sucesso ao virar a esquerda",
                            "Erro ao virar a esquerda"
                    );

                    break;
                case 9:
                    ok = bmw.turnRight();

                    showResult(ok,
                            "Sucesso ao virar a direita",
                            "Erro ao virar a direita"
                    );
                    break;
                default:
                    System.out.println("Inválido.");
                    break;

            }



        }
    }
}
