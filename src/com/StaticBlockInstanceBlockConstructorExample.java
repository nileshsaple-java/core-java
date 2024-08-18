package com;

public class StaticBlockInstanceBlockConstructorExample {

    static String staticVar; // Static variable
    String instanceVar; // Instance variable

    static { // Static initializer block
        staticVar = "Static Value";
        System.out.println("Static block - is used to Initialize Static Variables");
    }

    { // Instance initializer block
        instanceVar = "block Instance Value";
        System.out.println("Instance block - is used to Initialize Instance Variables");
    }

    // Constructor
    public StaticBlockInstanceBlockConstructorExample() {
        System.out.println("Constructor Executed");
    }

    public void display() {
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Instance Variable: " + instanceVar);
    }

    public static void main(String[] args) {
        StaticBlockInstanceBlockConstructorExample obj1 = new StaticBlockInstanceBlockConstructorExample();
        obj1.display();
    }
}

