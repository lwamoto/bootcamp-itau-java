package herancapolimorfismo.exercicios.relogio;

public non-sealed class BrazilianClock extends Clock{

    public BrazilianClock(int hour,
                          int minuto,
                          int second) {
        super(hour, minuto, second);
    }


    //O relógio brasileiro interpreta a hora americana como sempre de manhã
    @Override
    public void convertClock(Clock other) {
        setHour(other.getHour());
        setMinuto(other.getMinuto());
        setSecond(other.getSecond());
    }
}
