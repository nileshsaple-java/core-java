package com.oops.abstraction.example;

public interface Sensor {
    abstract void readData(); // abstract method

    default void calibrate(){ // default method
        System.out.println("Calibrating sensor");
    }
}
class TemperatureSensor implements Sensor {
    @Override
    public void readData(){
        System.out.println("Reading temperature data");
    }
}
class HumiditySensor implements Sensor {
    @Override
    public void readData() {
        System.out.println("Reading humidity data");
    }
}
class SensorTester {
    public static void main(String[] args) {
        Sensor tempSensor = new TemperatureSensor();
        tempSensor.calibrate();
        tempSensor.readData();
        System.out.println("===========================");
        Sensor humSensor = new HumiditySensor();
        humSensor.calibrate();
        humSensor.readData();
    }
}
