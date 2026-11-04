package herancapolimorfismo.introducao;

public class Main {

    public static void main(String[] args) {
        //Employee employee = new Employee();
        //Manager manager = new Manager();
        //Employee manager = new Manager();

        printEmployee(new Manager());
        printEmployee(new Salesmen());

    }

    public static void printEmployee(Employee employee){

        System.out.printf("===%s===\n", employee.getClass().getCanonicalName());

        switch (employee){
            case Manager manager -> {
                manager.setCode("123");
                manager.setName("Japa");
                manager.setSalary(5000);
                manager.setLogin("japa");
                manager.setPassword("123456");
                manager.setCommission(1200);

                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommission());
            }
            case Salesmen salesmen -> {
                salesmen.setCode("321");
                salesmen.setName("Gustavo");
                salesmen.setSalary(2800);
                salesmen.setPercentPerSold(10);
                salesmen.setSoldAmount(1000);

                System.out.println(salesmen.getCode());
                System.out.println(salesmen.getName());
                System.out.println(salesmen.getSalary());
                System.out.println(salesmen.getPercentPerSold());
                System.out.println(salesmen.getSoldAmount());
            }
        }
        System.out.println(employee.getFullSalary(500));
        System.out.println(employee.getFullSalary());
        System.out.println("========");
    }
}
