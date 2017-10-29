package com.company;

public class Person {
    String name;
    String address;
    int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void printName() {
        System.out.println("Your name is: " + name + ".");
    }
}
