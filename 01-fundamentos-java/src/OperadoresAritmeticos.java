import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        var value1 = scanner.nextFloat();
        System.out.println("Informe o segundo numero: ");
        var value2 = scanner.nextFloat();

        System.out.printf("%s + %s = %s\n", value1, value2, value1+value2); //Soma
        System.out.printf("%s - %s = %s\n", value1, value2, value1-value2); //Sub
        System.out.printf("%s / %s = %s\n", value1, value2, value1/value2); //Div
        System.out.printf("%s %% %s = %s\n", value1, value2, value1 % value2); //Resto da divisão
        System.out.printf("%s * %s = %s\n", value1, value2, value1*value2); //Mult

        var value = 5;
        value += 5;
        value -= 5;
        value /= 5;
        value *= 5;

        System.out.println(value);

        System.out.println("Informe o terceiro numero: ");
        var value3 = scanner.nextInt();
        System.out.printf("A raiz quadrada de %s é %s\n", value3, Math.sqrt(value3));

        System.out.println("Informe o quarto numero: ");
        var value4 = scanner.nextInt();
        System.out.println("Informe a potência desse numero: ");
        var value5 = scanner.nextInt();

        System.out.printf("A potência de %s é %s\n", value4, Math.pow(value4, value5));

        var value6 = 50;
        System.out.println(++value6); //--value subtrai 1 do value6
        System.out.println(value6);

        System.out.println(value6++); //Imprimi o valor primeiro e depois soma 1
        System.out.println(value6);

        System.out.println(10 + value6 ++);//Imprimi o valor +10, e depois soma 1
        System.out.println(10 + value6);



    }
}
