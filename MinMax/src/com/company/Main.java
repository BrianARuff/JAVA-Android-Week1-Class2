package com.company;

public class Main extends NumberManipulation {

    public static void main(String[] args) {
      NumberManipulation arrayOne = new NumberManipulation();
        System.out.println(arrayOne.getMinimum(new double[]{1, 2, 3, 4, 5}));
        System.out.println(arrayOne.getMaximum(new double[]{1, 2, 3, 4, 5,6,7,8,9,10}));
    }
}
