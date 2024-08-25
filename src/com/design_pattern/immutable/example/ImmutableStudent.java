package com.design_pattern.immutable.example;

public class ImmutableStudent {
    private final String name;
    private final int age;

    public ImmutableStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class main {
    public static void main(String[] args) {
        ImmutableStudent student1 = new ImmutableStudent("Roshan Saple", 24);
       /* student1.getName();
        student1.getAge();*/
        System.out.println("Student Name : " + student1.getName());
        System.out.println("Student Age : " + student1.getAge());

        ImmutableStudent student2 = new ImmutableStudent("Rohit Sharma", 37);
        System.out.println("Student Name : " + student2.getName());
        System.out.println("Student Age : " + student2.getAge());

    }

}
