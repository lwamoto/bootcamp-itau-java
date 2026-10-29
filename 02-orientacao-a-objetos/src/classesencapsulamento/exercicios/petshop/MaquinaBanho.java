package classesencapsulamento.exercicios.petshop;

public class MaquinaBanho {

    private boolean havePet;
    private int shampoo;
    private int water;
    private boolean isCleanMachine;
    private boolean isCleanPet;

    MaquinaBanho(){
        havePet = false;
        isCleanPet = false;
        isCleanMachine = true;
        shampoo = 10;
        water = 30;
    }

    boolean toWashPet(){
        if (shampoo < 2 || water < 10) return false;
        if (!isCleanMachine || isCleanPet || !havePet) return false;

        shampoo -= 2;
        water -= 10;
        isCleanPet = true ;
        return true;
    }

    boolean toWashMachine(){
        if (shampoo < 1 || water < 3) return false;
        if (isCleanMachine || havePet) return false;

        isCleanMachine = true;
        shampoo -= 1;
        water -= 3;
        return true;
    }

    boolean putWater(){
        int newWater = water + 2;
        if (newWater > 30) return false;


        water += 2;
        return true;
    }

    boolean putShampoo(){
        int newShampoo = shampoo + 2;
        if (newShampoo > 10) return false;

        shampoo += 2;
        return true;
    }

    boolean putPet(){
        if (havePet) return false;
        if (!isCleanMachine) return false;

        isCleanPet = false;
        havePet = true;
        return true;
    }

    boolean takePet(){
        if (!havePet) return false;

        havePet = false;
        if (!isCleanPet) {
            havePet = false;
            return true;
        }

        return true;
    }

    int getWater(){ return water; }

    int getShampoo(){ return shampoo; }

    boolean getHavePet(){ return havePet; }

}
