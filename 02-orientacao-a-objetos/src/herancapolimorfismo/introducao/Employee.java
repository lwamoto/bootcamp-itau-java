package herancapolimorfismo.introducao;

public sealed abstract class Employee permits Manager, Salesmen{

    protected String code;
    protected String name;
    protected String address;
    protected double salary;
    protected int age;

    public Employee(String code, String name, String address, double salary, int age) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double getFullSalary();

    public double getFullSalary(double extra){
        return this.getFullSalary() + extra;
    }
}
