package com.company;

public class Main {

    public static void main(String[] args) {
        Student studentOne = new Student("Brian Ruff", "Gastonia, NC", 28, "Gaston College",
                3.5, "CS");

        System.out.println(studentOne.getNameAndAddress());
        System.out.println(studentOne.getNameAndAge());
        System.out.println(studentOne.getNameAndCollege());
        System.out.println(studentOne.toString());
        System.out.println(studentOne.getCollegeAndGPA());
    }
}
