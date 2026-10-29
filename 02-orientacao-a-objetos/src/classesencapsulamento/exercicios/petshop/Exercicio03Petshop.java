package classesencapsulamento.exercicios.petshop;

import java.util.Scanner;

public class Exercicio03Petshop {

    static void showMessage(boolean ok, String sM, String eM){
        System.out.println(ok? sM : eM);
    }
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        MaquinaBanho golden = new MaquinaBanho();
        boolean ok;

        while (true){
            System.out.println("PetShop: ");
            System.out.println("1 Dar banho | 2 Abastecer água | 3 Abastecer shampoo");
            System.out.println("4 Verificar água | 5 Verificar shampoo | 6 Verificar pet");
            System.out.println("7 Colocar pet | 8 Retirar pet | 9 Limpar máquina | 0 Sair");
            var o = scanner.nextInt();
            switch (o){
                case 0:
                    return;
                case 1:
                    ok = golden.toWashPet();

                    showMessage(ok,
                            "Sucesso, ao dar banho!",
                            "Falha, ao dar banho."
                    );
                    break;
                case 2:
                    ok = golden.putWater();

                    showMessage(ok,
                            "Sucesso, ao colocar água!",
                            "Falha, ao colocar água."
                    );
                    break;
                case 3:
                    ok = golden.putShampoo();

                    showMessage(ok,
                            "Sucesso, ao colocar shampoo!",
                            "Falha, ao colocar shampoo."
                    );
                    break;
                case 4:
                    int agua = golden.getWater();
                    System.out.printf("Quantidade de água: %s\n", agua);

                    break;
                case 5:
                    int shampoo = golden.getShampoo();
                    System.out.printf("Quantidade de shampoo: %s\n", shampoo);

                    break;
                case 6:
                    ok = golden.getHavePet();

                    showMessage(ok,
                            "Sucesso, tem um pet!",
                            "Falha, não tem um pet"
                    );
                    break;
                case 7:
                    ok = golden.putPet();

                    showMessage(ok,
                            "Sucesso, ao colocar o pet",
                            "Falha, ao colocar o pet"
                    );
                    break;
                case 8:
                    ok = golden.takePet();

                    showMessage(ok,
                            "Sucesso, ao retirar pet",
                            "Falha, ao retirar pet"
                    );
                    break;
                case 9:
                    ok = golden.toWashMachine();

                    showMessage(ok,
                            "Sucesso, ao limpar a máquina",
                            "Falha, ao limpar a máquina"
                    );
                    break;
                default:
                    break;
            }

        }
    }
}
