import java.util.Scanner;

public class IntroducaoDesenvolvimento {

    private static final String WELCOME_MESSAGE = "Hello!";

    public static void main(String[] args){

        //Comentário
        var scanner = new Scanner(System.in);

        System.out.println( WELCOME_MESSAGE + " What's your name: ");
        var name = scanner.next();

        System.out.println("And, what's your age: ");
        var age = scanner.nextInt();

        System.out.printf("Hello, %s your age is %s \n", name, age);
    }

 }
