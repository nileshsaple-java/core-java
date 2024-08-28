package com.multithreading.examples;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable 1 - Count: " + i);
        }
    }
}

class AnotherRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable 2 - Count: " + i);
        }
    }
}

public class RunnableMain {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        //myRunnable.start(); // CE - Compilation Error
        //myRunnable.run(); //its not creating thread, it is a simple method execution

        // To create thread, you must call Thread class start() method,
        // by implementing Runnable interface or extending Thread class.

        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new AnotherRunnable());

        t1.setName("T1");
        t2.setName("T2");
        t1.start();
        t2.start();


        // Anonymous Inner class
        // Creating an anonymous inner class that implements the Runnable interface
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Runnable 3 - Count: " + i);
                }
            }
        };

        Thread t3 = new Thread(r);
        t3.start();

        //=========Using Functional Programming==========
        Runnable runnable = () -> {
            System.out.println("Running in a thread");
        };
        new Thread(runnable).start();

        //Thread t4 = new Thread(runnable);
        //t4.start();

    }
}