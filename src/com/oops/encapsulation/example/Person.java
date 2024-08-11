package com.oops.encapsulation.example;

import java.util.Scanner;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class PersonMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name ");
        String name = scanner.next();

        System.out.print("Enter Age ");
        int age = scanner.nextInt();

        if(age < 0){
            System.out.println("Invalid age");
           return;
        }

        Person person = new Person(name,age);

        System.out.println("Name is "+ person.getName() +" and age is "+person.getAge());

    }
}
