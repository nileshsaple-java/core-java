When multiple threads access a shared resource (such as a variable) without proper synchronization, the data may become corrupted due to race conditions. A **race condition** occurs when two or more threads try to modify the shared resource simultaneously, leading to unpredictable results.

### **Example of Shared Data Corruption**

Consider a `Counter` class where multiple threads increment a shared counter variable.

```java
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

public class Main {
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
```

### **Expected Output**:
- The final count should ideally be 2000 since both threads are incrementing the counter 1000 times.
- However, due to data corruption (race conditions), the actual result may be less than 2000 because both threads are modifying the `count` variable simultaneously, and some increments may be lost.

### **Fixing the Data Corruption**

You can ensure consistency by making the `increment()` method **thread-safe** using the `synchronized` keyword. This ensures that only one thread can access the method at a time.

```java
class Counter {
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

public class Main {
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

        // The final count will be consistently 2000 now
        System.out.println("Final Count: " + counter.getCount());
    }
}
```

### **Explanation**:
- By marking the `increment()` method as `synchronized`, only one thread can execute this method at a time, preventing multiple threads from modifying the `count` variable simultaneously.
- As a result, the data corruption (race condition) is eliminated, and the final count will always be 2000, as expected.

### **Output** (After Synchronization):
```
Final Count: 2000
```

### **Best Practice for Thread Safety**:
- Use `synchronized` methods or blocks when dealing with shared resources that can be accessed by multiple threads.
- Alternatively, you can use higher-level concurrency utilities like `ReentrantLock`, `AtomicInteger`, or other classes in the `java.util.concurrent` package for better control and performance in complex scenarios.