package com.oops.abstraction.example;

public interface Operable {
    abstract void operate ();

    default void start(){
        System.out.println("Machine Started");
    }
}
class Bus implements Operable {
    @Override
    public void operate(){
        System.out.println("Bus is operating");
    }
}
class Test {
    public static void main(String[] args) {
        Operable myBus = new Bus();
        myBus.start();
        myBus.operate();
    }
}

