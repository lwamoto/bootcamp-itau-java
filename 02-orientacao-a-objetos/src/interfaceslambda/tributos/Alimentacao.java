package interfaceslambda.tributos;

public class Alimentacao implements Tributavel{

    @Override
    public double calculateTax(double price) {
        return price * (1.0 /100);
    }

}
