package sintaxe;

import java.util.Scanner;

public class OperadoresAtribuicaoLogicos {

    private static final String MESSAGE = "O resultado é 4, você ";

    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        //System.out.println("Quanto é 2 +2");
        //var result = scanner.nextInt();

        //var isRight = result == 4;
        //System.out.printf( MESSAGE + " acertou? (%s)\n", isRight);

        //var isWrong = result != 4;
        //System.out.printf("(%s) errou? (%s)\n", MESSAGE, isWrong);

        //var isWhat = result != 4;
        //System.out.printf("O resultado é 4, você acertou? (%s)\n", !isWhat);


        System.out.println("Quanto anos você tem?");
        var age = scanner.nextInt();

        //var canDrive = age > 17;
        //var canDrive = age >= 18;
        //System.out.printf("Você pode dirigir? (%s)\n", canDrive);

        //var canNotDrive = !(age < 18);
        //System.out.printf("Você não pode dirigir? (%s)\n", !canNotDrive);

        System.out.println("Você é emancipado?");
        var isEmancipated = scanner.nextBoolean();

        var canDrive = age >= 18 || (isEmancipated && age >= 16);
        System.out.printf("Você pode dirigir? (%s)\n", canDrive);
        //Existe 2 tipos de OR
        // || -> Precisa de uma verdade, se entrar true na primeira opções retorna, antes de ver a segunda
        // |  -> Precisa de uma verdade, mesmo se encontrar true na primeira opção, verifica a segunda

    }
}
