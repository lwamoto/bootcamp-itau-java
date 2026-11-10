package interfaceslambda.tributos;

public class Cultura implements Tributavel{
    @Override
    public double calculateTax(double price) {
        return price * (4.0/100);
    }
}
