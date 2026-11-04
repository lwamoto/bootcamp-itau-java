package herancapolimorfismo.exercicios.cinema;

public non-sealed class MeiaEntrada extends Ingresso{

    public MeiaEntrada(double price,
                       String movie,
                       boolean version) {
        super(price,movie,version);
    }

    @Override
    public double getRealPrice(){
        return (price / 2);
    }

}
