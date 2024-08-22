package com.oops.polymorphism;

import java.io.IOException;
import java.io.InputStream;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    public void walk(String name) throws IOException {
        System.out.println("walk");


    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void walk(String anyName) {
        System.out.println("walk");
        throw new RuntimeException("Some Exception");

    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.sound();  // Calls the overridden method in Dog

        myAnimal = new Cat();
        myAnimal.sound();  // Calls the overridden method in Cat
    }
}