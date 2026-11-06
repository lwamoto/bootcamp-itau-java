package herancapolimorfismo.exercicios.usuarios;

public final class Atendente extends Usuario{

    private double cashAmount;
    private double fullCashAmount;
    public Atendente(String name,
                     String email,
                     String password) {
        super(name, email, password, false);
    }

    public double getCashAmount() {
        return cashAmount;
    }

    public boolean receivePayment(double value){
        if (value <= 0){
            return false;
        }
        cashAmount += value;
        return true;
    }

    public boolean closeCashRegister(){
        if (cashAmount <= 0) return false;
        fullCashAmount += cashAmount;
        cashAmount = 0;
        return true;
    }

    public double getFullCashAmount() {
        return fullCashAmount;
    }
}
