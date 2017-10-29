package com.company;

public class Student extends Person implements IPerson {
    String college;
    double GPA;
    String degree;

    public Student(String name, String address, int age, String college, double GPA, String degree) {
        super(name, address, age);
        this.college = college;
        this.GPA = GPA;
        this.degree = degree;
    }

    @Override
    public String getNameAndAge() {
        return "Your name is" + name + ", and your age is " + age;
    }

    @Override
    public String getNameAndAddress() {
        return "Your name is " + name + ", and your address is " + address;
    }

    @Override
    public String getNameAndCollege() {
        return "Your name is " + name + ", and your college is " + degree;
    }

    @Override
    public String toString() {
        return "Student{" +
                "college='" + college + '\'' +
                ", GPA=" + GPA +
                ", degree='" + degree + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String getCollegeAndGPA() {
        return "Student college >> " + college + ". Student GPA >> " + GPA;
    }
}
