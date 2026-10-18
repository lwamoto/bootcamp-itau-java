public class TiposPrimitivos {

    public static void main(String[] args) {
        byte NumberByte = 1;
        short NumberShort = 1;
        int Numberint =1;
        long NumberLong = 1L;
        float NumberFloat = 1.0f;
        double NumberDouble = 1.0d;

        var NumberVar = 1;
        //Caso queria que o var tenha outro tipo de valor
        //precisara ser adicionado L,f ou d. Caso não seja
        //ele terá o valor igual ao int

        char CharacterCharNumber = 1;
        char CharacterChar = 'a';

        var CharacterVar = 'a';
        //Char vale tanto para letra quanto para números,
        //mas caso coloque com " ", ele tera o valor de string

        boolean BoolTrue = true;
        boolean BoolFalse = false;

        var BoolVar = true;

    }
}
//Ctrl Alt + o
//Retira todos os imports que
//estão sendo utilizados