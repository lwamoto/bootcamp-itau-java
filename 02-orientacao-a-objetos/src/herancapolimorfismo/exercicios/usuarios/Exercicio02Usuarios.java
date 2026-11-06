package herancapolimorfismo.exercicios.usuarios;

import java.util.Scanner;

public class Exercicio02Usuarios {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Gerente gerente = new Gerente("japaChef", "japaChef@gmail.com", "japaChef");
        Vendedor vendedor = new Vendedor("japaVendas", "japaVendas@gmail.com", "japaVendas");
        Atendente atendente = new Atendente("japaAtende", "japaAtende@gmail.com", "japaAtende");

        atendente.login("japaAtende@gmail.com", "japaAtende");
        atendente.logoff();

        gerente.login("japaChef@gmail.com","japaChef");
        gerente.logoff();

        System.out.println(vendedor.login("japaVendas@gmail.com", "japaVendas") );
        System.out.println(vendedor.logoff());


    }
}
