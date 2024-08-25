package com.multithreading.examples.data_safety;

class Counter1 {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        count++;
    }

    // Method to get the count
    public int getCount() {
        return count;
    }
}

public class SharedDataSafetyMain {
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter = new Counter1();
        
        // Creating two threads that increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Starting both threads
        t1.start();
        t2.start();

        // Waiting for both threads to finish
        t1.join();
        t2.join();

        // The final count will be consistently 2000 now
        System.out.println("Final Count: " + counter.getCount());
    }
}