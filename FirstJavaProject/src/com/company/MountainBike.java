package com.company;

public class MountainBike extends Bicycles {

    int seatHeight;


    public MountainBike(int speed, int gear, int seat) {
        super(speed, gear);
        this.seatHeight = seat;
    }

    public int getSeatHeight(int seatHeight) {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public void speedUp() {
        this.speed = speed + 2;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "seatHeight=" + seatHeight +
                ", speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}
