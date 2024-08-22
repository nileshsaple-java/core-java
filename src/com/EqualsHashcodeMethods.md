The `equals` and `hashCode` methods are fundamental to the Java Object class and are essential for proper functioning in collections and other operations that depend on object comparison.

### **`equals` Method**

- **Purpose**: The `equals` method is used to compare two objects for equality. By default, it checks if two references point to the same object in memory (i.e., it uses reference equality).

- **Signature**:
  ```java
  public boolean equals(Object obj)
  ```

- **Implementation**:
    - **Default Implementation**: In the `Object` class, it checks if the current object (`this`) is the same as the passed object (`obj`).
    - **Custom Implementation**: When you override `equals`, you need to define what equality means for instances of your class. Typically, this involves comparing the fields of the objects.

- **When to Use**:
    - Use `equals` to check if two objects are considered equal based on their content rather than their memory address.
    - Commonly used in collections like `Set`, `Map`, and in algorithms that require equality checks.

#### **Example of `equals` Method**

```java
import java.util.Objects;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Different class or null
        }
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name); // Field comparison
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Consistent with equals
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

public class EqualsExample {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);
        Person p3 = new Person("Bob", 25);

        System.out.println(p1.equals(p2)); // true, because names and ages are the same
        System.out.println(p1.equals(p3)); // false, different names and ages
    }
}
```

### **`hashCode` Method**

- **Purpose**: The `hashCode` method provides a hash code (an integer) for the object, which is used in hash-based collections like `HashSet` and `HashMap`. It helps in efficiently locating objects in these collections.

- **Signature**:
  ```java
  public int hashCode()
  ```

- **Implementation**:
    - **Default Implementation**: In the `Object` class, it returns a native hash code value for the object.
    - **Custom Implementation**: When you override `equals`, you should also override `hashCode` to ensure that equal objects have the same hash code. This is crucial for the correct functioning of hash-based collections.

- **When to Use**:
    - Override `hashCode` when you override `equals` to maintain consistency. Equal objects must have the same hash code.
    - Used in hash-based collections like `HashMap`, `HashSet`, and `Hashtable`.

#### **Example of `hashCode` Method**

```java
import java.util.Objects;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Generate hash code based on fields
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

public class HashCodeExample {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);
        Person p3 = new Person("Bob", 25);

        System.out.println(p1.hashCode()); // Consistent hash code for same field values
        System.out.println(p2.hashCode()); // Same hash code as p1
        System.out.println(p3.hashCode()); // Different hash code
    }
}
```

### **Consistency Between `equals` and `hashCode`**

- **Contract**: If two objects are equal according to the `equals` method, they must have the same hash code. However, if two objects have the same hash code, they are not necessarily equal.
- **Hash-Based Collections**: Collections like `HashSet` and `HashMap` use `hashCode` to quickly locate objects. If `hashCode` is not implemented correctly, it can lead to issues like incorrect behavior in these collections.

### **Summary**

- **`equals`**: Determines if two objects are equal based on content. Always override `equals` when you need to compare objects for logical equality.
- **`hashCode`**: Provides a hash code for the object, essential for hash-based collections. Always override `hashCode` when you override `equals` to maintain consistency.

By correctly implementing `equals` and `hashCode`, you ensure that your objects behave correctly in collections and other scenarios that rely on object comparison and hashing.