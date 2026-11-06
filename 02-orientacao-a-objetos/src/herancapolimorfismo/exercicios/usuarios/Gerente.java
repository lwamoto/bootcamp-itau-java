package herancapolimorfismo.exercicios.usuarios;

public final class Gerente extends Usuario {

    public Gerente(String name,
                   String email,
                   String password){

        super(name, email, password, true);
    }

    public void generateReport (){
        System.out.println("Relatorio financeiro gerado! ");
    }

    public int checkSales(Vendedor vendedor){
        return vendedor.getSalesCount();
    }


}
