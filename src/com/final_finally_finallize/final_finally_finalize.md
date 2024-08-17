In Java, the `final` keyword is used to apply restrictions on classes, methods, and variables. The `final` keyword can be used in several contexts:

1. **Final Variables**:
    - When a variable is declared as `final`, its value cannot be changed once it is initialized. This essentially makes it a constant.
    - Example:
      ```java
      public class Example {
          final int MAX_VALUE = 100;
 
          void changeValue() {
              // MAX_VALUE = 200; // This will cause a compilation error
          }
      }
      ```

2. **Final Methods**:
    - A method declared as `final` cannot be overridden by subclasses. This is useful to prevent altering the functionality of a method in derived classes.
    - Example:
      ```java
      public class Base {
          final void display() {
              System.out.println("This is a final method.");
          }
      }
 
      public class Derived extends Base {
          // void display() { // This will cause a compilation error
          //     System.out.println("Attempting to override.");
          // }
      }
      ```

3. **Final Classes**:
    - A class declared as `final` cannot be subclassed. This is often used to prevent inheritance for security reasons or to maintain immutability.
    - Example:
      ```java
      public final class ImmutableClass {
          // class contents
      }
 
      // public class SubClass extends ImmutableClass { // This will cause a compilation error
      // }
      ```

4. **Final Parameters**:
    - When a method parameter is declared as `final`, it means that the parameter cannot be changed within the method.
    - Example:
      ```java
      public class Example {
          void display(final int param) {
              // param = 100; // This will cause a compilation error
              System.out.println(param);
          }
      }
      ```

Using the `final` keyword enhances security and precision in programming by clearly defining which parts of your code should remain constant and unchanged.


========================

In Java, the `finally` block is used in exception handling to execute important code such as closing resources, regardless of whether an exception is thrown or not. The `finally` block is always executed after the `try` and `catch` blocks have been executed, ensuring that certain clean-up code is executed no matter what.

**Usage of `finally`:**

- **Resource Management**: The `finally` block is typically used for resource management tasks such as closing files, releasing network resources, or cleaning up memory. This ensures that resources are freed even if an exception occurs.

- **Execution Guarantee**: Code within the `finally` block is guaranteed to execute, regardless of whether an exception was thrown or caught. This makes it a reliable place to perform any cleanup operations.

**Example**:
```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int data = 25 / 0;  // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block is always executed.");
        }
    }
}
```

In this example, even though an `ArithmeticException` is thrown and caught in the `catch` block, the `finally` block will still execute, printing "Finally block is always executed."

**Key Points**:
- If the `try` block executes without any exceptions, the `finally` block will still execute after the `try` block.
- If an exception is thrown and caught, the `finally` block will execute after the `catch` block.
- If an exception is thrown but not caught, the `finally` block will execute before the exception is propagated up the call stack.

Using `finally` ensures that your program can handle resources properly and avoid resource leaks, which is crucial in writing robust and reliable applications.

=============================


In Java, garbage collection (GC) is the process of automatically identifying and discarding objects that are no longer needed by a program, thereby reclaiming resources for reuse. This helps in managing memory efficiently and prevents memory leaks, which can occur when objects are no longer used but are not freed from memory.

### Garbage Collection

- **Automatic Memory Management**: Java's garbage collector automatically handles memory deallocation, which means developers do not need to manually free memory as in languages like C or C++.
- **Generational Collection**: Java's garbage collector often uses generational collection, which categorizes objects by their ages. Typically, the heap is divided into young and old generations, optimizing the collection process by focusing on short-lived objects more frequently.
- **Mark and Sweep**: A common algorithm used by Java's garbage collector, which involves marking live objects and sweeping away the dead ones.

### `gc()` Method

- **Purpose**: The `gc()` method is a hint to the Java Virtual Machine (JVM) to initiate garbage collection. However, it is not guaranteed that calling `gc()` will immediately start the garbage collection process.
- **Usage**: The method can be called using `System.gc()` or `Runtime.getRuntime().gc()`.
- **Example**:
  ```java
  public class GcExample {
      public static void main(String[] args) {
          // Hint to JVM to run garbage collection
          System.gc();
          System.out.println("Garbage collection requested.");
      }
  }
  ```

### `finalize()` Method

- **Purpose**: The `finalize()` method is invoked by the garbage collector before an object is removed from memory. It is intended to allow the object to clean up resources before being collected.
- **Deprecated**: As of Java 9, the `finalize()` method has been deprecated because it can lead to unpredictable behavior and performance issues. It is recommended to use other resource management techniques, such as try-with-resources or explicit close methods.
- **Usage**:
  ```java
  public class FinalizeExample {
      @Override
      protected void finalize() throws Throwable {
          try {
              System.out.println("Finalize method called.");
              // Cleanup code
          } finally {
              super.finalize();
          }
      }

      public static void main(String[] args) {
          FinalizeExample example = new FinalizeExample();
          example = null; // Eligible for garbage collection
          System.gc(); // Request garbage collection
      }
  }
  ```

In summary, garbage collection in Java helps manage memory automatically, while the `gc()` method can be used to request garbage collection and the `finalize()` method (now deprecated) was used to perform cleanup operations before an object is collected.


===========


In Java, `final`, `finally`, and `finalize()` serve different purposes, and understanding these differences is crucial for many technical interviews. Here's a breakdown of each:

### `final` Keyword

- **Purpose**: The `final` keyword is used to apply restrictions in Java.
    - **Final Variables**: When a variable is declared as `final`, its value cannot be changed once it is initialized.
    - **Final Methods**: A method declared as `final` cannot be overridden by subclasses.
    - **Final Classes**: A class declared as `final` cannot be subclassed.

- **Example**:
  ```java
  final int MAX_VALUE = 100; // Final variable
  ```

### `finally` Block

- **Purpose**: The `finally` block is used in exception handling to execute code after a `try` block, regardless of whether an exception is thrown or not. It is typically used for clean-up activities like releasing resources.

- **Example**:
  ```java
  try {
      // Code that might throw an exception
  } catch (Exception e) {
      // Exception handling
  } finally {
      // Code that will always be executed
  }
  ```

### `finalize()` Method

- **Purpose**: The `finalize()` method was used to perform cleanup operations on objects before they are removed from memory by the garbage collector. However, it has been deprecated since Java 9 due to its unpredictable behavior and performance issues.

- **Example**:
  ```java
  protected void finalize() throws Throwable {
      // Cleanup code
  }
  ```

In summary, `final` is a keyword for defining constants, preventing method overriding, and preventing inheritance; `finally` is a block used for executing code after try-catch blocks for cleanup purposes; and `finalize()` was a method for cleanup before garbage collection, but is now deprecated.