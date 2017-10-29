package com.company;

public class NumberManipulation {
    double[] array;

    public double getMaximum(double [] newArray) {
        double minimum = Double.MIN_VALUE;
        array = newArray;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public double getMinimum(double [] newArray) {
        array = newArray;
        double maximum = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }
}
