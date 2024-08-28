### **Anonymous Class in Java**

An **anonymous class** in Java is a type of inner class that does not have a name and is used to create an instance of an object with certain modifications, usually for implementing interfaces or extending classes without the need for a separate class file. It is defined and instantiated all in one expression, making it useful for short-term use cases, such as providing method implementations on the fly.

### **Example 1: Anonymous Class Implementing an Interface**

In this example, we create an anonymous inner class that implements the `Runnable` interface.

```java
public class AnonymousClassExample1 {
    public static void main(String[] args) {
        // Creating an anonymous inner class that implements the Runnable interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in an anonymous inner class implementing Runnable!");
            }
        };

        // Start the thread
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
```

**Output**:
```
Running in an anonymous inner class implementing Runnable!
```

Here, we used an anonymous class to implement the `Runnable` interface without the need to create a separate class. The anonymous class provides the body of the `run()` method, and we pass this to a new thread.

### **Example 2: Anonymous Class Extending a Class**

In this example, we use an anonymous class to extend an abstract class `Animal`.

```java
abstract class Animal {
    abstract void makeSound();
}

public class AnonymousClassExample2 {
    public static void main(String[] args) {
        // Creating an anonymous inner class that extends the abstract class Animal
        Animal dog = new Animal() {
            @Override
            void makeSound() {
                System.out.println("The dog says: Bark!");
            }
        };

        // Calling the method of the anonymous inner class
        dog.makeSound();
    }
}
```

**Output**:
```
The dog says: Bark!
```

In this example, we extend the abstract class `Animal` using an anonymous inner class and provide an implementation for the `makeSound()` method directly.

### **Summary of Use Cases**:
- **Anonymous classes** are typically used when you need to override a method or implement an interface but do not need to create a named class for it.
- **Common applications**: Event listeners, callbacks, thread implementation (`Runnable`), and providing specific behaviors to abstract classes.