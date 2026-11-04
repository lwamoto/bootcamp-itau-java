package herancapolimorfismo.exercicios.cinema;

public non-sealed class IngressoFamilia extends Ingresso{
     private int countPeople;

     public IngressoFamilia(double price,
                            String movie,
                            boolean version,
                            int countPeople) {

         super(price,movie,version);
         this.countPeople = countPeople;

     }

    public double getcountPeople() {
        return countPeople;
    }

    public void setcountPeople(int countPeople) {
        this.countPeople = countPeople;
    }

    @Override
    public double getRealPrice(){
         double fullPrice = price * countPeople;
         if (countPeople > 3) fullPrice = fullPrice * 0.95;

        return fullPrice;
    }
}
