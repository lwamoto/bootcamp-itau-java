package herancapolimorfismo.introducao;

public non-sealed class Salesmen extends Employee{

    private double percentPerSold;
    private double soldAmount;

    public Salesmen(String code,
                    String name,
                    String address,
                    double salary,
                    int age,
                    double percentPerSold,
                    double soldAmount) {

        super(code, name, address, salary, age);
        this.percentPerSold = percentPerSold;
        this.soldAmount = percentPerSold;

    }

    public Salesmen() {
    }

    @Override
    public String getCode(){
        return "SL" + this.code;
    }

    @Override
    public double getFullSalary() {
        return this.salary + (soldAmount * percentPerSold) /100;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
