package com.oops.abstraction.example;

abstract class Machine {

    abstract void operate();// abstract method

    void start() {
        System.out.println("Machine is started"); //concrete method
    }
}

class Tractor extends Machine {
    @Override
    void operate() {
        System.out.println("Tractor is operating");
    }
}

class Car extends Machine {
    @Override
    void operate() {
        System.out.println("Car is operating");

    }
}

class MachineTest {
    public static void main(String[] args) {
        Machine myTractor = new Tractor();
        Car myCar = new Car();

        myTractor.start();
        myTractor.operate();
        System.out.println("====================");
        myCar.start();
        myCar.operate();

    }
}