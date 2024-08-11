package com.oops.abstraction.example;

abstract class Vehicle {

    abstract void performMaintenance(); // abstract method

    public void checkOil() {  //concrete method
        System.out.println("Checking oil lever");
    }

    public void checkTires() { //concrete method
        System.out.println("Checking tire pressure");
    }
}

class Truck extends Vehicle {

    @Override
    void performMaintenance() {
        System.out.println("Performing maintenance for the Truck");
    }
}

class Bulldozar extends Vehicle {
    @Override
    void performMaintenance() {
        System.out.println("Performing maintenance for the Bulldozar");
        System.out.print("=======================================");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle myTruck = new Truck();
        myTruck.checkOil();
        myTruck.checkTires();
        myTruck.performMaintenance();
        System.out.println("====================================");

        Vehicle myBulldozar = new Bulldozar();
        myBulldozar.checkOil();
        myBulldozar.checkTires();
        myBulldozar.performMaintenance();
    }
}

