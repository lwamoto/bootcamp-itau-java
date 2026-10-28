package classes_encapsulamento.exercicios.carro;

public class Carro {

    private boolean engineOn ;
    private int speed;
    private int gear;
    Carro(){
        engineOn = false;
        gear = 0;
        speed = 0;
    }

    boolean turnOn(){
        if (engineOn) return false;

        engineOn = true;
        return true;
    }

    boolean turnOff(){
        if (!engineOn) return false;
        if (gear != 0 || speed != 0) return false;

        engineOn = false;
        return true;
    }

    boolean accelerate(){
        if (!engineOn || gear == 0) return false;
        if (speed + 1 > gear * 20)return false;

        speed = speed + 1;
        return true;
    }

    boolean decelerate(){
        if (!engineOn) return false;
        if (speed - 1 < 0) return false;


        if (gear >= 2 && speed -1 < (gear - 1) * 20 + 1)return false;

        speed -= 1;
        return true;
    }

    boolean changeGear(int setGear){
        if (!engineOn || setGear == gear) return false;
        if (setGear > 6 || setGear < 0 ) return false;
        if (Math.abs(setGear - gear) > 1) return false;

        gear = setGear;
        return true;
    }

    public int getGear() {
        return gear;
    }

    int getSpeed(){
        return speed;
    }

    private boolean canTurn(){
        if (!engineOn) return false;
        if (speed < 1 || speed > 40) return false;


        return true;
    }

    boolean turnLeft(){
        if (!canTurn())return false;

        return true;
    }

    boolean turnRight(){
        return canTurn();
    }









}
