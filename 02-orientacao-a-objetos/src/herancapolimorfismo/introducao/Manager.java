package herancapolimorfismo.introducao;
//extens classe, é a herança
//final não permite extends para outras classes
public non-sealed class Manager extends Employee{

    private String login;
    private String password;
    private double commission;

    public Manager(String code,
                   String name,
                   String address,
                   double salary,
                   int age,
                   String login,
                   String password,
                   double commission) {

        super(code, name, address, salary, age);
        this.login = login;
        this.password = password;
        this.commission = commission;
    }

    @Override
    public String getCode(){
        return "MN" + super.getCode();
    }

    @Override
    public double getFullSalary() {
        return this.salary + commission;
    }
    /*
    public double getFullSalary(double extra){
        return this.getFullSalary() + extra;
    }
    */

    public Manager() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
