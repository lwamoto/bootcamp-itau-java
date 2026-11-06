package herancapolimorfismo.exercicios.relogio;

public class Exercise03Clock {

    public static void main(String[] args) {

        BrazilianClock brazilianClock = new BrazilianClock(12,0,0);

        AmericanClock americanClock = new AmericanClock(0,0,0);

        System.out.println("Brazilian: ");

        americanClock.convertClock(brazilianClock);
        System.out.println(brazilianClock.getClock());

        System.out.println("Fica: ");
        System.out.println(americanClock.getClock());

        System.out.println("Americano: ");
        brazilianClock.convertClock(americanClock);
        System.out.println(americanClock.getClock());

        System.out.println("Fica: ");
        System.out.println(brazilianClock.getClock());
    }
}
