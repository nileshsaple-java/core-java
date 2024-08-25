package com.multithreading.examples.data_safety;

class Counter {
    private int count = 0;

    // Method to increment the count
    public void increment() {
        count++;
    }
    // Method to get the count
    public int getCount() {
        return count;
    }
}

public class SharedDataCorruptionMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        
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

        // The expected count should be 2000, but it may not be due to data corruption
        System.out.println("Final Count: " + counter.getCount());
    }
}
