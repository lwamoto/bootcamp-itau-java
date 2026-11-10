package interfaceslambda.tributos;

public class SaudeBemEstar implements Tributavel{
    @Override
    public double calculateTax(double price) {
        return price * (1.5/100);

    }
}
