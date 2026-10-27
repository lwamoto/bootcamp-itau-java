package classes_encapsulamento.records;

public record Person(String name, int age) {
    //CONSTRUTOR COMPCTO
    /*
    public Person{
        System.out.println("======");
        System.out.println(name);
        System.out.println(age);
        System.out.println("======");
    }
    */

    //CONSTRUTOR SECUNDÁRIO
    public Person( String name){
        this(name, 1);
    }

    //ISSO É UM GETTER
    public String getInfo(){
        return "Name: " + name + " Age: " + age;
    }
}
