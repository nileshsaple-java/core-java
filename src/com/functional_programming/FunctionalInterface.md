### **What is a Functional Interface in Java?**

A **functional interface** in Java is an interface that contains exactly one abstract method. These interfaces are used to define a single behavior or function, and they are a key feature of functional programming in Java. Functional interfaces can have multiple default or static methods, but they must have only one abstract method.

The main purpose of a functional interface is to provide a way to implement functional programming patterns, such as passing behavior (e.g., lambda expressions or method references) as arguments to methods.

### **Key Characteristics**:
- **Single Abstract Method (SAM)**: A functional interface must have only one abstract method. This is also known as a SAM interface.
- **Default and Static Methods**: A functional interface can have multiple default or static methods in addition to its single abstract method.
- **`@FunctionalInterface` Annotation**: Although optional, it is a good practice to annotate a functional interface with `@FunctionalInterface`. This annotation ensures that the interface cannot have more than one abstract method.

### **Need for Functional Interfaces**:
- **Enabling Lambda Expressions**: Functional interfaces are the target types for lambda expressions, allowing for more concise and readable code.
- **Encouraging Functional Programming**: They enable functional programming in Java, which focuses on writing code that describes what to do rather than how to do it.
- **Improving Code Reusability**: By defining behaviors as functional interfaces, you can pass them around as parameters, making code more modular and reusable.

### **Examples of Functional Interfaces in Java**:

1. **`java.lang.Runnable`**:
    - Method: `void run()`
    - Example:
      ```java
      Runnable runnable = () -> System.out.println("Running in a thread");
      new Thread(runnable).start();
      ```

2. **`java.util.function.Predicate<T>`**:
    - Method: `boolean test(T t)`
    - Example:
      ```java
      Predicate<String> isEmpty = s -> s.isEmpty();
      System.out.println(isEmpty.test("")); // Output: true
      ```

3. **`java.util.function.Consumer<T>`**:
    - Method: `void accept(T t)`
    - Example:
      ```java
      Consumer<String> print = s -> System.out.println(s);
      print.accept("Hello, World!"); // Output: Hello, World!
      ```

4. **`java.util.function.Function<T, R>`**:
    - Method: `R apply(T t)`
    - Example:
      ```java
      Function<String, Integer> length = s -> s.length();
      System.out.println(length.apply("Java")); // Output: 4
      ```

5. **`java.util.function.Supplier<T>`**:
    - Method: `T get()`
    - Example:
      ```java
      Supplier<Double> randomValue = () -> Math.random();
      System.out.println(randomValue.get());
      ```

6. **`java.util.Comparator<T>`**:
    - Method: `int compare(T o1, T o2)`
    - Example:
      ```java
      Comparator<Integer> comparator = (a, b) -> a - b;
      System.out.println(comparator.compare(3, 2)); // Output: 1
      ```

### **Creating a Custom Functional Interface**:

You can also create your own functional interfaces. For example:

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;

        System.out.println("Addition: " + add.calculate(10, 5)); // Output: 15
        System.out.println("Subtraction: " + subtract.calculate(10, 5)); // Output: 5
    }
}
```

### **Summary**:
- **Functional interfaces** allow you to write more concise and expressive code using lambda expressions and method references.
- They play a crucial role in enabling functional programming in Java.
- Java provides several built-in functional interfaces in the `java.util.function` package, such as `Predicate`, `Consumer`, `Function`, and `Supplier`.
- You can also define your own functional interfaces to represent specific behaviors in your application.

This concept is widely used in Java 8 and later versions, particularly in streams and lambda expressions.