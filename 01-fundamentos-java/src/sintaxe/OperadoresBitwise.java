package sintaxe;

public class OperadoresBitwise {


    public static void main(String[] args) {
        var value1 = 2;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (representação em binária %s)\n", value1, binary1);

        var value2 = 9;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (representação em binária %s)\n", value2, binary2);

        var result = value1 | value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s | %s = %s (Representação binária %s)\n", value1, value2, result, binaryResult);
    }

    /*
        Nos OR | conta cada binário separado, e para cada true ( 1 ), ele retorna um true ( 1 )
        Nos AND &, e para o AND retornar true ele precisa que o dois sejam true ( 1 )
        Nos XOR ^, retorna true para valores binarios diferentes e false para valores iguais
        Nos NOT ~, inverte o valor binario, 110 vira 001

        0 = False
        1 = True

        6 = 1 1 0     4 = 1 0 0
        5 = 1 0 1     5 = 1 0 1

        7 = 1 1 1     5 = 1 0 1


        SHIF OPERATOR <<

        LEFT <<, basicamente "empurra" para a esquerda os binarios na quantidade que estiver na direito do <<,
        nesse caso 2 casas ( e completa com 0 )

        RIGHT >>,basicamente "empurra" para a direita os binarios na quantidade que estiver na esquera do >>,
        nesse caso 9 casas ( e completa com o primeiro numero, se começa com 1 (positivo) completa com 1,
        se começa com 0 (negativo) completa com 0).

        9 = 1001
        2 = 10

        9 << 2 = 100100
        2 >> 9 =


    */
}
