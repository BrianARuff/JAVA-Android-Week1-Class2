package com.company;

public class Main {

    public static void main(String[] args) {

	    Bicycles bike = new Bicycles(100,3);

        System.out.println(bike);

        MountainBike mbike = new MountainBike(100,3,2);
        mbike.speedUp();
        System.out.println(mbike);

        bike = mbike;
        mbike.getSeatHeight(2);

        GraphicObject circle = new Circle();
    }
}
