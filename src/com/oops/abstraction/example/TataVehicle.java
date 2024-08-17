package com.oops.abstraction.example;

abstract class TataVehicle {

    abstract void performMaintenance();

    public void checkOil() {
        System.out.println("Checking oil level");
    }

    public void checkTyres(){
        System.out.println("Checking tyre pressure");
    }
}
class TataAce extends TataVehicle {

    @Override
    void performMaintenance() {
        System.out.println("Performing maintenance for Tata Ace truck");
    }
}
class TataSafari extends TataVehicle {

    @Override
    void performMaintenance() {
        System.out.println("Performing maintenance for Tata Safari car");
    }
}
class VehicleRunner {
    public static void main(String[] args) {
        TataVehicle tataAce = new TataAce();
        tataAce.checkOil();
        tataAce.checkTyres();
        tataAce.performMaintenance();
        System.out.println("=======================================");
        TataVehicle tataSafari = new TataSafari();
        tataSafari.checkOil();
        tataSafari.checkTyres();
        tataSafari.performMaintenance();
    }
}
