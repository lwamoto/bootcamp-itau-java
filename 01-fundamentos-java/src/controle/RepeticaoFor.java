package controle;

import java.util.Scanner;

public class RepeticaoFor {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //for (;;) Imprime infinitamente
        /*
        for (var i = 1;i<=10; i++){
            if (i % 2 == 0 ) continue;
            System.out.println(i);
        }
        */


        for (var j = 0; j < args.length;j++){
            System.out.println((j + 1) + " - " + args[j]);
        }


        /*
        for (var arg : args){
            System.out.println(arg);
        }
        */

    }
}
