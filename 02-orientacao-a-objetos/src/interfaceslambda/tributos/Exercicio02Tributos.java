package interfaceslambda.tributos;

public class Exercicio02Tributos {

    public static void main(String[] args) {
        Tributavel alimentacao = new Alimentacao();
        Tributavel saudebemestar = new SaudeBemEstar();
        Tributavel cultura = new Cultura();
        Tributavel vestuario = new Vestuario();

        System.out.println("Tributo de Alimentação: " + alimentacao.calculateTax(100));
        System.out.println("Tributo de Saude e Bem-Estar: " + saudebemestar.calculateTax(100));
        System.out.println("Tributo de Cultura: " + cultura.calculateTax(100));
        System.out.println("Tributo de Vestuario: " + vestuario.calculateTax(100));
    }
}
