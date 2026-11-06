package herancapolimorfismo.exercicios.relogio;

public abstract sealed class Clock permits AmericanClock, BrazilianClock {

    private int hour;
    private int minuto;
    private int second;

    public Clock(int hour, int minuto, int second) {
        this.hour = hour;
        this.minuto = minuto;
        this.second = second;
    }

    public abstract void convertClock(Clock other);

    public String getClock(){
        return String.format("%02d:%02d:%02d",hour, minuto,second);
    }

    public int getHour() {
        return hour;
    }

    public boolean setHour(int hour) {
        if (hour >= 24 || hour < 0) return false;

        this.hour = hour;
        return true;
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean setMinuto(int minuto) {
        if (minuto >= 60 || minuto < 0) return false;

        this.minuto = minuto;
        return true;
    }

    public int getSecond() {
        return second;
    }

    public boolean setSecond(int second) {
        if (second >= 60 || second < 0) return false;

        this.second = second;
        return true;
    }
}
