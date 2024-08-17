package com.collections.list.arraylist;

import java.util.ArrayList;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age + " Years old";
    }
}
class ArrayListCustomObject {
    public static void main(String[] args) {

        // Creating an ArrayList of Person objects
        ArrayList<Person> people = new ArrayList<>();

        // Adding Person objects to the ArrayList
        people.add(new Person("Roshan",24));
        people.add(new Person("Rohan",20));
        people.add(new Person("Rakesh",30));

        // Printing the ArrayList
        for(Person person : people) {
            System.out.println(person);
        }
    }
}
