Certainly! Here are five problems involving `Map` in Java using an `Employee` object. Each problem includes a problem definition, inputs, expected outputs, and a complete Java solution with comments and explanations.

### Problem 1: Map Employees by Department

**Problem Definition**:
Group a list of `Employee` objects by their department using a `Map`.

**Inputs**:
- List of employees:
    - Employee("Alice", 101, "Engineering", 60000)
    - Employee("Bob", 102, "HR", 50000)
    - Employee("Charlie", 103, "Engineering", 55000)

**Expected Output**:
- Map:
    - "Engineering": [Alice, Charlie]
    - "HR": [Bob]

**Java Solution**:
```java
import java.util.*;

class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}

public class EmployeesByDepartment {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        for (Employee employee : employees) {
            departmentMap.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        }
        return departmentMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 101, "Engineering", 60000),
            new Employee("Bob", 102, "HR", 50000),
            new Employee("Charlie", 103, "Engineering", 55000)
        );

        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);
        groupedEmployees.forEach((department, empList) -> {
            System.out.print(department + ": ");
            empList.forEach(emp -> System.out.print(emp.getName() + " "));
            System.out.println();
        });
    }
}
```

**Explanation**:
- The `groupByDepartment` method uses a `Map` to group employees by their department.
- The `computeIfAbsent` method initializes a new list for each department if it doesn't already exist, then adds the employee to that list.
- The main method demonstrates grouping and prints employees by department.

### Problem 2: Calculate Average Salary by Department

**Problem Definition**:
Calculate the average salary of employees in each department using a `Map`.

**Inputs**:
- List of employees:
    - Employee("Alice", 101, "Engineering", 60000)
    - Employee("Bob", 102, "HR", 50000)
    - Employee("Charlie", 103, "Engineering", 55000)

**Expected Output**:
- Average Salary:
    - "Engineering": 57500.0
    - "HR": 50000.0

**Java Solution**:
```java
import java.util.*;
import java.util.stream.*;

public class AverageSalaryByDepartment {
    public static Map<String, Double> calculateAverageSalary(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee employee : employees) {
            departmentMap.computeIfAbsent(employee.getDepartment(), k -> new ArrayList<>()).add(employee);
        }

        Map<String, Double> averageSalaryMap = new HashMap<>();
        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            String department = entry.getKey();
            List<Employee> empList = entry.getValue();
            double averageSalary = empList.stream().mapToDouble(emp -> emp.salary).average().orElse(0);
            averageSalaryMap.put(department, averageSalary);
        }

        return averageSalaryMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 101, "Engineering", 60000),
            new Employee("Bob", 102, "HR", 50000),
            new Employee("Charlie", 103, "Engineering", 55000)
        );

        Map<String, Double> averageSalaries = calculateAverageSalary(employees);
        averageSalaries.forEach((department, avgSalary) -> {
            System.out.println(department + ": " + avgSalary);
        });
    }
}
```

**Explanation**:
- First, `groupByDepartment` groups employees, then it calculates the average salary for each department.
- The average salary is computed using a stream to calculate the average of salaries in each department.
- The main method demonstrates calculating average salaries and prints the result.

### Problem 3: Count Employees in Each Department

**Problem Definition**:
Count the number of employees in each department.

**Inputs**:
- List of employees:
    - Employee("Alice", 101, "Engineering", 60000)
    - Employee("Bob", 102, "HR", 50000)
    - Employee("Charlie", 103, "Engineering", 55000)

**Expected Output**:
- Count:
    - "Engineering": 2
    - "HR": 1

**Java Solution**:
```java
import java.util.*;

public class EmployeeCountByDepartment {
    public static Map<String, Integer> countEmployeesByDepartment(List<Employee> employees) {
        Map<String, Integer> countMap = new HashMap<>();
        for (Employee employee : employees) {
            countMap.put(employee.getDepartment(), countMap.getOrDefault(employee.getDepartment(), 0) + 1);
        }
        return countMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 101, "Engineering", 60000),
            new Employee("Bob", 102, "HR", 50000),
            new Employee("Charlie", 103, "Engineering", 55000)
        );

        Map<String, Integer> departmentCounts = countEmployeesByDepartment(employees);
        departmentCounts.forEach((department, count) -> {
            System.out.println(department + ": " + count);
        });
    }
}
```

**Explanation**:
- The `countEmployeesByDepartment` method uses a `Map` to count employees in each department.
- It iterates over each employee, incrementing the count for their respective department.
- The main method demonstrates counting and prints the department counts.

### Problem 4: Highest Paid Employee by Department

**Problem Definition**:
Determine the highest-paid employee in each department using a `Map`.

**Inputs**:
- List of employees:
    - Employee("Alice", 101, "Engineering", 60000)
    - Employee("Bob", 102, "HR", 50000)
    - Employee("Charlie", 103, "Engineering", 55000)

**Expected Output**:
- Highest Paid:
    - "Engineering": Alice
    - "HR": Bob

**Java Solution**:
```java
import java.util.*;

public class HighestPaidEmployee {
    public static Map<String, Employee> highestPaidByDepartment(List<Employee> employees) {
        Map<String, Employee> Certainly! Continuing from where we left off with the solution for finding the highest-paid employee by department:

```java
public class HighestPaidEmployee {
    public static Map<String, Employee> highestPaidByDepartment(List<Employee> employees) {
        Map<String, Employee> highestPaidMap = new HashMap<>();
        for (Employee employee : employees) {
            highestPaidMap.merge(employee.getDepartment(), employee, (existing, newEmp) -> 
                existing.salary > newEmp.salary ? existing : newEmp);
        }
        return highestPaidMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 101, "Engineering", 60000),
            new Employee("Bob", 102, "HR", 50000),
            new Employee("Charlie", 103, "Engineering", 55000)
        );

        Map<String, Employee> highestPaidEmployees = highestPaidByDepartment(employees);
        highestPaidEmployees.forEach((department, employee) -> {
            System.out.println(department + ": " + employee.getName());
        });
    }
}
```

**Explanation**:
- The `highestPaidByDepartment` method uses `Map.merge()` to determine the highest-paid employee by comparing salaries.
- For each department, it updates the map with the employee that has a higher salary.
- The main method demonstrates finding the highest-paid employee for each department and prints their names.

### Problem 5: Employee Age Bracket Count

**Problem Definition**:
Count the number of employees in each age bracket (e.g., 20-29, 30-39) using a `Map`.

**Inputs**:
- List of employees with age:
    - Employee("Alice", 101, "Engineering", 60000, 28)
    - Employee("Bob", 102, "HR", 50000, 34)
    - Employee("Charlie", 103, "Engineering", 55000, 41)

**Expected Output**:
- Age Bracket Count:
    - "20-29": 1
    - "30-39": 1
    - "40-49": 1

**Java Solution**:
```java
class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;
    private int age;

    public Employee(String name, int id, String department, double salary, int age) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class AgeBracketCounter {
    public static Map<String, Integer> countByAgeBracket(List<Employee> employees) {
        Map<String, Integer> ageBracketMap = new HashMap<>();
        for (Employee employee : employees) {
            String bracket = getAgeBracket(employee.getAge());
            ageBracketMap.put(bracket, ageBracketMap.getOrDefault(bracket, 0) + 1);
        }
        return ageBracketMap;
    }

    private static String getAgeBracket(int age) {
        if (age >= 20 && age < 30) return "20-29";
        if (age >= 30 && age < 40) return "30-39";
        if (age >= 40 && age < 50) return "40-49";
        return "50+";
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 101, "Engineering", 60000, 28),
            new Employee("Bob", 102, "HR", 50000, 34),
            new Employee("Charlie", 103, "Engineering", 55000, 41)
        );

        Map<String, Integer> ageBracketCounts = countByAgeBracket(employees);
        ageBracketCounts.forEach((bracket, count) -> {
            System.out.println(bracket + ": " + count);
        });
    }
}
```

**Explanation**:
- The `countByAgeBracket` method categorizes employees into age brackets and counts the number in each bracket using a `Map`.
- The `getAgeBracket` helper method determines the appropriate bracket based on age.
- The main method demonstrates counting employees in each age bracket and prints out the results.

These examples demonstrate various ways to use `Map` in Java for organizing, counting, and analyzing data related to `Employee` objects.