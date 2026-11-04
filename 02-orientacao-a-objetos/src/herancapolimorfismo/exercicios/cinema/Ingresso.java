package herancapolimorfismo.exercicios.cinema;

public sealed class Ingresso permits MeiaEntrada, IngressoFamilia{

    protected double price;
    protected String movie;
    protected boolean version ;

    public Ingresso (double price, String movie, boolean version){

        this.price = price;
        this.movie = movie;
        this.version = version;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public boolean isVersion() {
        return version;
    }

    public void setVersion(boolean version) {
        this.version = version;
    }

    public double getRealPrice(){
        return price;
    }
}
