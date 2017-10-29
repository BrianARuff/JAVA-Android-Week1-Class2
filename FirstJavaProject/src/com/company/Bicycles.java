package com.company;

public class Bicycles {
    int speed = 0, gear = 1;

    public void speedUp(int increment){
        this.speed = this.speed + increment;
    }

    public void speedUp(){
        this.speed = this.speed + 1;
    }

    public void speedUp(int increment, int decrement){
        this.speed = this.speed + increment - decrement;
    }
    public static void getVersion(){

    }

    public Bicycles(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Bicycles{" +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}
