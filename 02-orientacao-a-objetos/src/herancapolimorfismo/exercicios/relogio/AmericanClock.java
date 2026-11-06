package herancapolimorfismo.exercicios.relogio;

public non-sealed class AmericanClock extends Clock{

    public AmericanClock(int hour,
                         int minuto,
                         int second) {
        super(hour, minuto, second);
    }

    @Override
    public void convertClock(Clock other) {
        int newConvert = other.getHour();
        if (newConvert <= 23 && newConvert >= 13) newConvert -= 12;

        if (newConvert == 0) setHour(newConvert);

        setHour(newConvert);
        setMinuto(other.getMinuto());
        setSecond(other.getSecond());

        //if (newConvert >= 1 && newConvert <= 12)

    }

    @Override
    public boolean setHour(int hour) {
        if (hour > 12 || hour < 1) return false;

        super.setHour(hour);
        return true;
    }


}
