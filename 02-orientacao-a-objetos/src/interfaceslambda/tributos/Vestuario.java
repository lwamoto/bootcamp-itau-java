package interfaceslambda.tributos;

public class Vestuario implements Tributavel{
    @Override
    public double calculateTax(double price) {
        return price * (2.5/100);
    }
}
