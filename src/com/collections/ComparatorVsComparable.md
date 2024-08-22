In Java, `Comparator` and `Comparable` are interfaces used for sorting objects. They serve different purposes and are used in different scenarios.

### **`Comparable` Interface**

- **Purpose**: The `Comparable` interface is used to define the natural ordering of objects of a class. This is useful for sorting objects in a natural order using methods like `Collections.sort()` or `Arrays.sort()`.

- **Methods**:
    - `int compareTo(T o)`: Compares the current object with the specified object to determine their order.

- **When to Use**:
    - Use `Comparable` when you want to define a natural ordering for objects of a class and want the class itself to dictate how it is sorted.

#### **Example of `Comparable`**

Suppose you have a `Person` class and you want to sort a list of `Person` objects by their age. You can implement `Comparable` in the `Person` class:

```java
import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Sorting by age
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );

        Collections.sort(people);
        System.out.println(people); // Output: [Bob: 25, Alice: 30, Charlie: 35]
    }
}
```

### **`Comparator` Interface**

- **Purpose**: The `Comparator` interface is used to define multiple ways to compare objects, separate from the class itself. This is useful when you need different sorting orders or if you cannot modify the class to implement `Comparable`.

- **Methods**:
    - `int compare(T o1, T o2)`: Compares two objects and returns a negative integer, zero, or a positive integer as the first object is less than, equal to, or greater than the second.

- **When to Use**:
    - Use `Comparator` when you need to define custom sorting orders or when you want to sort objects in different ways.

#### **Example of `Comparator`**

Suppose you want to sort `Person` objects by name instead of age, or you need different sorting criteria:

```java
import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );

        // Sort by age using Comparable
        Collections.sort(people, Comparator.comparingInt(p -> p.age));
        System.out.println("Sorted by age: " + people);

        // Sort by name using Comparator
        Collections.sort(people, Comparator.comparing(p -> p.name));
        System.out.println("Sorted by name: " + people);

        // Reverse order by age using Comparator
        Collections.sort(people, Comparator.comparingInt(p -> p.age).reversed());
        System.out.println("Reversed by age: " + people);
    }
}
```

### **Practical Examples**

1. **Sorting by Multiple Criteria (Using `Comparator`)**:
   ```java
   import java.util.*;

   class Employee {
       String name;
       int salary;
       int age;

       public Employee(String name, int salary, int age) {
           this.name = name;
           this.salary = salary;
           this.age = age;
       }

       @Override
       public String toString() {
           return name + " | Salary: " + salary + " | Age: " + age;
       }
   }

   public class MultiCriteriaSorting {
       public static void main(String[] args) {
           List<Employee> employees = Arrays.asList(
               new Employee("Alice", 50000, 30),
               new Employee("Bob", 60000, 25),
               new Employee("Charlie", 60000, 30),
               new Employee("David", 50000, 25)
           );

           // Sort by salary first, then by age
           employees.sort(Comparator.comparingInt(Employee::getSalary)
                                    .thenComparingInt(Employee::getAge));
           System.out.println("Sorted by salary and age: " + employees);
       }
   }
   ```

2. **Custom Order (Using `Comparator`)**:
   ```java
   import java.util.*;

   class Book {
       String title;
       int pages;

       public Book(String title, int pages) {
           this.title = title;
           this.pages = pages;
       }

       @Override
       public String toString() {
           return title + ": " + pages + " pages";
       }
   }

   public class CustomOrderSorting {
       public static void main(String[] args) {
           List<Book> books = Arrays.asList(
               new Book("Java Basics", 300),
               new Book("Advanced Java", 500),
               new Book("Java Design Patterns", 400)
           );

           // Sort by number of pages in descending order
           books.sort(Comparator.comparingInt(Book::getPages).reversed());
           System.out.println("Sorted by pages (descending): " + books);
       }
   }
   ```

### **Conclusion**

- **`Comparable`**: Use it when you want to define the natural ordering of a class, and the class itself should implement the order.
- **`Comparator`**: Use it when you need different ways to sort objects or cannot modify the class to implement `Comparable`.

These interfaces provide flexibility in sorting and comparing objects, enhancing the functionality and usability of your code.