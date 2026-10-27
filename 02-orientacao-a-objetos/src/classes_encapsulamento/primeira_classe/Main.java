package classes_encapsulamento.primeira_classe;

public class Main {

    public static void main(String[] args) {
        /*
        final transforma em constante, que nunca muda, nesse exemplo o codigo da uma sugestão
        para remover o final e poder dar outro valor para o teste

        final String teste = new "teste";
        teste = "";

        final protege a VARIÁVEL, não o objeto.
        male é uma variável que referencia (aponta para) o objeto criado
        com new Person("Japa"). Como é final, ela não pode apontar para
        outro objeto, mas o conteúdo do objeto pode mudar.

        final var male = new Person("Japa");
        male = new Person("");

        male.setAge(18);
        */

        /*
        var male = new Person("Japa", 2);
        //male.setName("Japa");
        //male.setAge(18);
        male.incAge();

        var female = new Person("Rafa");
        //female.setName("Rafa");
        //female.setAge(22);

        System.out.println("Male name: " + male.getName() + " age: " + male.getAge() );
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge() );
        */

    }
}
