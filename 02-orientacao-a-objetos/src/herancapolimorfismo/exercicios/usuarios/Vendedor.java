package herancapolimorfismo.exercicios.usuarios;

public final class Vendedor extends Usuario{

    private int salesCount;
    public Vendedor(String name,
                    String email,
                    String password) {
        super(name, email, password, false);
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void makeSale(){
        salesCount += 1;
    }
}
