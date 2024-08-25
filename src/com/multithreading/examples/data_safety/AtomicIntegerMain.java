package com.multithreading.examples.data_safety;

import java.util.concurrent.atomic.AtomicInteger;

class Counter3 {
    private AtomicInteger count = new AtomicInteger(0); // Using AtomicInteger for thread safety

    // Method to increment the count atomically
    public void increment() {
        count.incrementAndGet();
    }

    // Method to get the count
    public int getCount() {
        return count.get();
    }
}

public class AtomicIntegerMain {
    public static void main(String[] args) throws InterruptedException {
        Counter3 counter = new Counter3();

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

        // The final count will be 2000 consistently because AtomicInteger is thread-safe
        System.out.println("Final Count: " + counter.getCount());
    }
}
