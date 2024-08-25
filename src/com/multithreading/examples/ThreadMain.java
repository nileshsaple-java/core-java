package com.multithreading.examples;

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("Thread 1 - Count: " + i);
        }
    }
}

class AnotherThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("Thread 2 - Count: " + i);
        }
    }
}

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        AnotherThread t2 = new AnotherThread();

        //t1.run(); //It will execute this statement with normal execution, no thread created at this line

        t1.setName("T1");
        t2.setName("T2");

        t1.setPriority(1);


        t1.start();
        t2.start();
        System.out.println("hello");
    }
}