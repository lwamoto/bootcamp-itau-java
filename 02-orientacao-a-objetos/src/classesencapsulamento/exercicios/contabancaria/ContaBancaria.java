package classesencapsulamento.exercicios.contabancaria;
//GETTER e SETTER
//Get vê
//Set edita

public class ContaBancaria {

    private double balance;
    private final double overDraftLimit;

    ContaBancaria(double firstDeposit){
        balance = firstDeposit;

        if (firstDeposit <= 500) { overDraftLimit = 50; }
        else { overDraftLimit = firstDeposit/2; }
    }

    ///SALDO 1
    //GETTER
    double getBalance(){
        return balance;
    }

    ///CHEQUE ESPECIAL 2
     double getOverDraftLimit(){
        return overDraftLimit;
    }

    ///CHEQUE ESPECIAL VERIFICACAO 6
    boolean isUsingOverdraft(){
        return balance < 0;
    }

    ///DEPOSITO 3
    //SETTER
    boolean deposit(double newDeposit) {
        if (newDeposit <= 0) return false;

        if (balance < 0){

            double usedOverDraft = -balance;
            double tax = (0.20 * usedOverDraft);
            balance = balance - tax;
        }
        balance = balance + newDeposit;
        return true;
    }

    ///SAQUE 4
    //SETTER
    boolean withdraw(double newWithDraw){

        if (newWithDraw <= balance + overDraftLimit){
            balance = balance - newWithDraw;
            return true;
        }else{
            return false;
        }
    }

    ///BOLETO 5
    boolean payBill(double newWithDraw){
        if (newWithDraw <= balance + overDraftLimit){
            balance = balance - newWithDraw;
            return true;
        }else{
            return false;
        }
    }

}


