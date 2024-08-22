### Exception Handling in Java

Exception handling in Java is a mechanism that allows a program to handle runtime errors in a controlled way, ensuring the normal flow of the application. Java provides several constructs for handling exceptions: `try`, `catch`, `finally`, `throw`, and `throws`.

#### Key Concepts:

1. **Exceptions**:
    - An exception is an event that disrupts the normal flow of the program during execution.
    - Exceptions are objects that represent an error or unexpected behavior.
    - Java has two main types of exceptions:
        - **Checked exceptions**: Exceptions that are checked at compile-time (e.g., `IOException`, `SQLException`).
        - **Unchecked exceptions (Runtime exceptions)**: Exceptions that are checked at runtime (e.g., `NullPointerException`, `ArrayIndexOutOfBoundsException`).

2. **Try-Catch Block**:
    - The `try-catch` block is used to handle exceptions. Code that might throw an exception is written inside the `try` block, and the corresponding exception handling code is written inside one or more `catch` blocks.

3. **Finally Block**:
    - The `finally` block is used to execute code that must run, whether an exception occurs or not. It is typically used for cleanup code, like closing resources (e.g., files or database connections).

4. **Throw**:
    - The `throw` keyword is used to explicitly throw an exception from a method or block of code.

5. **Throws**:
    - The `throws` keyword is used in a method signature to declare that the method might throw specific exceptions. It notifies the caller of the method to handle these exceptions.

---

### Exception Handling Flow:
1. **Try Block**: This block contains code that might throw an exception.
2. **Catch Block**: This block contains code that handles the specific exception thrown in the try block.
3. **Finally Block**: This block executes code after the try-catch blocks, regardless of whether an exception was thrown or caught.
4. **Throw Keyword**: This keyword is used to manually throw an exception.
5. **Throws Keyword**: This keyword is used to declare exceptions that a method might throw.

---

### Example: Try-Catch-Finally

```java
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This will always execute, regardless of exception.");
        }
    }
}
```

**Explanation**:
- **Try Block**: Attempts to access an index in an array that is out of bounds (`numbers[3]`).
- **Catch Block**: Handles the `ArrayIndexOutOfBoundsException`.
- **Finally Block**: Executes regardless of whether the exception occurs. It is often used for resource cleanup.

---

### Example: Throw Keyword

```java
public class ThrowExample {
    public static void main(String[] args) {
        try {
            validateAge(15);  // This will throw an exception
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");  // Manually throwing an exception
        }
        System.out.println("Age is valid.");
    }
}
```

**Explanation**:
- **Throw**: The `throw` keyword is used to manually throw an exception (`IllegalArgumentException`) if the age is below 18.
- **Catch Block**: Catches and handles the manually thrown exception.

---

### Example: Throws Keyword

```java
import java.io.*;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Declaring that this method may throw an IOException
    static void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);
        BufferedReader fileInput = new BufferedReader(file);

        // Print first line of file
        System.out.println(fileInput.readLine());
        fileInput.close();
    }
}
```

**Explanation**:
- **Throws**: The `throws` keyword in the `readFile` method signature indicates that this method might throw an `IOException`.
- **Try-Catch Block**: The method call is wrapped in a `try-catch` block to handle the `IOException` in case the file does not exist.

---

### When to Use Them:

- **`try-catch`**:
    - Use when you want to handle specific exceptions in your code.
    - Useful when there’s a possibility of an exception that you want to handle locally, without propagating it.

- **`finally`**:
    - Use when you have code that must be executed regardless of whether an exception occurs or not. It’s typically used for resource cleanup (e.g., closing files or network connections).

- **`throw`**:
    - Use when you want to explicitly throw an exception from your code. It’s helpful when you need to signal an error condition or enforce certain rules (e.g., invalid input).

- **`throws`**:
    - Use when a method could potentially throw an exception that it does not handle itself. The `throws` keyword is used to propagate the exception up the call stack, notifying the calling method to handle it.

---

### Summary:

- **Try**: The block of code where an exception can occur.
- **Catch**: Handles the specific exception thrown by the try block.
- **Finally**: Executes code that should run regardless of exceptions (cleanup code).
- **Throw**: Manually throws an exception.
- **Throws**: Declares exceptions that a method may throw, allowing the caller to handle them.


------------

### Example of Checked Exception in Java

Checked exceptions are exceptions that are checked at compile-time by the compiler. They must either be caught within a `try-catch` block or declared in the method signature using the `throws` keyword. Common examples of checked exceptions include `IOException`, `SQLException`, `FileNotFoundException`, and `ClassNotFoundException`.

Here’s an example of a **checked exception** using `FileNotFoundException` and `IOException`.

### Example Code: Handling Checked Exception

```java
import java.io.*;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // This line might throw a FileNotFoundException (Checked Exception)
            FileReader file = new FileReader("somefile.txt");

            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}
```

### Explanation:

1. **Checked Exception**:
    - The `FileReader` constructor in the code might throw a `FileNotFoundException` if the file `"somefile.txt"` does not exist. Since this is a **checked exception**, it must either be caught with a `try-catch` block or declared using `throws` in the method signature.
    - The `readLine()` method might throw an `IOException`, which is also a checked exception. It too needs to be caught or declared.

2. **Try-Catch Block**:
    - The code that may throw an exception is placed inside the `try` block.
    - We handle the `FileNotFoundException` in the first `catch` block, and the `IOException` in the second `catch` block.

### Output Example:

If the file `"somefile.txt"` does not exist, the output will be:

```
FileNotFoundException caught: somefile.txt (The system cannot find the file specified)
```

If the file exists and can be read, the first line of the file will be printed.

---

### Key Points About Checked Exceptions:

- **Checked at Compile-Time**: The Java compiler forces the programmer to handle checked exceptions, ensuring that potential errors are either handled or declared.
- **Common Examples**:
    - `FileNotFoundException`
    - `IOException`
    - `SQLException`
    - `ClassNotFoundException`

Checked exceptions are typically used for scenarios where the program cannot recover from the error easily, and the developer is required to take some corrective action, such as handling file operations, database access, or network communication.