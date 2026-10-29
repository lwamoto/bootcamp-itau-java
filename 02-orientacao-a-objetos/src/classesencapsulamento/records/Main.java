package classesencapsulamento.records;

public class Main {

    public static void main(String[] args) {

        //var person = new Person("Japa", 18);
        var person = new Person("Japa");
        //System.out.println(person);
        System.out.println(person.name());

        System.out.println(person.getInfo());

    }
}
