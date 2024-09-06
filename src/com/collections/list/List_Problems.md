### Problem 1: Employee Salary Calculation

**Problem Definition**:
Create a class `Employee` with attributes like `name`, `id`, `department`, and `base_salary`. Implement a method `calculate_salary()` that calculates the total salary including a 10% bonus of the base salary.

**Inputs**:
- An employee object with the following attributes:
    - `name`: "John Doe"
    - `id`: 101
    - `department`: "Engineering"
    - `base_salary`: 50000

**Expected Output**:
- Total Salary: 55000.0

**Java Solution**:
```java
class Employee {
    private String name;
    private int empId;
    private String department;
    private double baseSalary;

    // Constructor to initialize employee details
    public Employee(String name, int empId, String department, double baseSalary) {
        this.name = name;
        this.empId = empId;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    // Method to calculate total salary including a 10% bonus
    public double calculateSalary() {
        return baseSalary * 1.10;
    }

    // Getters for employee attributes
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}

// Main class to test the Employee class
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 101, "Engineering", 50000);
        System.out.println("Total Salary: " + employee.calculateSalary());
    }
}
```

**Explanation**:
- The `Employee` class is defined with attributes for the employee's details.
- The `calculateSalary` method computes the salary by adding a 10% bonus to the base salary.
- The `Main` class tests the functionality by creating an `Employee` object and printing the calculated total salary.

### Problem 2: Filter Employees by Department

**Problem Definition**:
Given a list of `Employee` objects, implement a function to filter employees belonging to a specific department.

**Inputs**:
- List of employees:
    - "Alice", 102, "Engineering", 60000
    - "Bob", 103, "HR", 50000
    - "Charlie", 104, "Engineering", 55000
- Department to filter: "Engineering"

**Expected Output**:
- Names of Employees in Engineering: Alice, Charlie

**Java Solution**:
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    // Method to filter employees by department
    public static List<Employee> filterByDepartment(List<Employee> employees, String department) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getDepartment().equals(department)) {
                filteredEmployees.add(emp);
            }
        }
        return filteredEmployees;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 102, "Engineering", 60000));
        employees.add(new Employee("Bob", 103, "HR", 50000));
        employees.add(new Employee("Charlie", 104, "Engineering", 55000));

        List<Employee> engineeringEmployees = filterByDepartment(employees, "Engineering");
        System.out.println("Employees in Engineering:");
        for (Employee emp : engineeringEmployees) {
            System.out.println(emp.getName());
        }
    }
}
```

**Explanation**:
- The `filterByDepartment` method iterates over the list of employees, checking each employee's department.
- Employees belonging to the specified department are added to a new list.
- The `Main` class demonstrates filtering employees by their department and prints the names of those in "Engineering".

### Problem 3: Sort Employees by Name

**Problem Definition**:
Implement a function that sorts a list of `Employee` objects by their `name` attribute.

**Inputs**:
- List of employees:
    - "Charlie", 104, "Engineering", 55000
    - "Alice", 102, "Engineering", 60000
    - "Bob", 103, "HR", 50000

**Expected Output**:
- Sorted names of employees: Alice, Bob, Charlie

**Java Solution**:
```java
import java.util.List;
import java.util.Comparator;

public class Main {
    // Method to sort employees by name
    public static List<Employee> sortEmployeesByName(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getName));
        return employees;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Charlie", 104, "Engineering", 55000));
        employees.add(new Employee("Alice", 102, "Engineering", 60000));
        employees.add(new Employee("Bob", 103, "HR", 50000));

        List<Employee> sortedEmployees = sortEmployeesByName(employees);
        System.out.println("Sorted Employees by Name:");
        for (Employee emp : sortedEmployees) {
            System.out.println(emp.getName());
        }
    }
}
```

**Explanation**:
- The `sortEmployeesByName` method sorts employees using the `Comparator` interface, comparing based on the `name` attribute.
- The `Main` class shows sorting functionality and prints the sorted employee names.

### Problem 4: Employee Promotion

**Problem Definition**:
Add a method `promote()` to the `Employee` class that increases the employee's `base_salary` by 20%.

**Inputs**:
- An employee object with `base_salary`: 50000

**Expected Output**:
- New base salary after promotion: 60000.0

**Java Solution**:
```java
class Employee {
    // Initialization and previous methods...

    // Method to promote the employee by increasing base salary by 20%
    public void promote() {
        this.baseSalary *= 1.20;
    }
}

// Main class to test the promotion method
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 101, "Engineering", 50000);
        System.out.println("Base Salary before Promotion: " + employee.getBaseSalary());
        employee.promote();
        System.out.println("Base Salary after Promotion: " + employee.getBaseSalary());
    }
}
```

**Explanation**:
- The `promote` method modifies the `baseSalary` by increasing it by 20%.
- The `Main` class demonstrates this functionality by showing the salary before and after the promotion.

### Problem 5: Calculate Average Salary

**Problem Definition**:
Implement a function that calculates the average salary of a list of `Employee` objects.

**Inputs**:
- List of employees with salaries: 50000, 60000, 55000

**Expected Output**:
- Average Salary: 55000.0

**Java Solution**:
```java
public class Main {
    // Method to calculate the average salary of employees
    public static Certainly! Let's continue with the Java solution for calculating the average salary of employees.

```java
    // Method to calculate the average salary of employees
    public static double calculateAverageSalary(List<Employee> employees) {
        double totalSalary = 0;
        for (Employee emp : employees) {
            totalSalary += emp.getBaseSalary();
        }
        return totalSalary / employees.size();
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 102, "Engineering", 60000));
        employees.add(new Employee("Bob", 103, "HR", 50000));
        employees.add(new Employee("Charlie", 104, "Engineering", 55000));

        double averageSalary = calculateAverageSalary(employees);
        System.out.println("Average Salary: " + averageSalary);
    }
}
```

**Explanation**:
- The `calculateAverageSalary` method computes the average salary by summing up all the base salaries of the employees and dividing by the total number of employees.
- It iterates through the employee list, accumulating the total salary.
- The `Main` class sets up a list of employees and demonstrates the calculation of the average salary, printing the result to the console.
