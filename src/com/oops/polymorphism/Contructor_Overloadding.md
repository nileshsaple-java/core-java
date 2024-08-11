Constructor overloading in Java is a feature that allows a class to have more than one constructor with different parameter lists. Each constructor performs a different initialization task based on the number and type of arguments passed.

### Example of Constructor Overloading

Let's create a `Vehicle` class with multiple constructors to demonstrate constructor overloading.

**Vehicle Class**:
```java
class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double price;

    // No-argument constructor
    public Vehicle() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.price = 0.0;
    }

    // Constructor with one parameter
    public Vehicle(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.year = 0;
        this.price = 0.0;
    }

    // Constructor with two parameters
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = 0;
        this.price = 0.0;
    }

    // Constructor with three parameters
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = 0.0;
    }

    // Constructor with four parameters
    public Vehicle(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display vehicle details
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}
```

**Main Class**:
```java
public class Main {
    public static void main(String[] args) {
        // Creating Vehicle objects using different constructors
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle("Toyota");
        Vehicle vehicle3 = new Vehicle("Ford", "Mustang");
        Vehicle vehicle4 = new Vehicle("Chevrolet", "Camaro", 2020);
        Vehicle vehicle5 = new Vehicle("Tesla", "Model S", 2021, 79999.99);

        // Displaying vehicle details
        System.out.println("Vehicle 1:");
        vehicle1.display();
        
        System.out.println("\nVehicle 2:");
        vehicle2.display();
        
        System.out.println("\nVehicle 3:");
        vehicle3.display();
        
        System.out.println("\nVehicle 4:");
        vehicle4.display();
        
        System.out.println("\nVehicle 5:");
        vehicle5.display();
    }
}
```

### Explanation

1. **Vehicle Class**:
    - **Fields**: The `Vehicle` class has private fields `brand`, `model`, `year`, and `price`.
    - **No-argument Constructor**: Initializes all fields to default values.
      ```java
      public Vehicle() {
          this.brand = "Unknown";
          this.model = "Unknown";
          this.year = 0;
          this.price = 0.0;
      }
      ```
    - **Constructor with One Parameter**: Initializes the `brand` field and sets default values for the other fields.
      ```java
      public Vehicle(String brand) {
          this.brand = brand;
          this.model = "Unknown";
          this.year = 0;
          this.price = 0.0;
      }
      ```
    - **Constructor with Two Parameters**: Initializes the `brand` and `model` fields and sets default values for the other fields.
      ```java
      public Vehicle(String brand, String model) {
          this.brand = brand;
          this.model = model;
          this.year = 0;
          this.price = 0.0;
      }
      ```
    - **Constructor with Three Parameters**: Initializes the `brand`, `model`, and `year` fields and sets a default value for the `price` field.
      ```java
      public Vehicle(String brand, String model, int year) {
          this.brand = brand;
          this.model = model;
          this.year = year;
          this.price = 0.0;
      }
      ```
    - **Constructor with Four Parameters**: Initializes all fields.
      ```java
      public Vehicle(String brand, String model, int year, double price) {
          this.brand = brand;
          this.model = model;
          this.year = year;
          this.price = price;
      }
      ```
    - **display Method**: Displays the vehicle details.
      ```java
      public void display() {
          System.out.println("Brand: " + brand);
          System.out.println("Model: " + model);
          System.out.println("Year: " + year);
          System.out.println("Price: $" + price);
      }
      ```

2. **Main Class**:
    - **Vehicle Objects**: Creates five `Vehicle` objects using different constructors.
    - **Display Method**: Calls the `display` method for each `Vehicle` object to print the vehicle details.



### Output

When you run the `Main` class, you should see the following output:

```
Vehicle 1:
Brand: Unknown
Model: Unknown
Year: 0
Price: $0.0

Vehicle 2:
Brand: Toyota
Model: Unknown
Year: 0
Price: $0.0

Vehicle 3:
Brand: Ford
Model: Mustang
Year: 0
Price: $0.0

Vehicle 4:
Brand: Chevrolet
Model: Camaro
Year: 2020
Price: $0.0

Vehicle 5:
Brand: Tesla
Model: Model S
Year: 2021
Price: $79999.99
```


### Key Points

- **Constructor Overloading**: The `Vehicle` class has multiple constructors with different parameter lists, demonstrating constructor overloading.
- **Initialization Flexibility**: Constructor overloading provides flexibility in initializing objects with different sets of parameters.
- **Default Values**: Constructors with fewer parameters set default values for the fields that are not initialized.

This example demonstrates how constructor overloading allows creating objects with different initializations based on the number and type of arguments passed.


### Key Points
In Java, **constructor overriding is technically not possible** because constructors are not inherited by subclasses. Instead, subclasses can call constructors of their superclass using the super keyword. This allows the subclass to initialize the state inherited from the superclass while adding its own initialization logic.