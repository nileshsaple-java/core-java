package com.stateBeheviourIdentity;

// Main class to demonstrate creating and using an Employee object
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Employee class
        Employee emp1 = new Employee("Alice", 101, 50000);
        // Displaying the state of the Employee object
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Employee ID: " + emp1.getId());
        System.out.println("Employee Salary: " + emp1.getSalary());


        // Calling the behavior of the Employee object
        emp1.work();
        emp1.raiseSalary(5000);

        // Creating another object of the Employee class
        Employee emp2 = new Employee("Bob", 102, 60000);
        // Displaying the state of the second Employee object
        System.out.println("Employee Name: " + emp2.getName());
        System.out.println("Employee ID: " + emp2.getId());
        System.out.println("Employee Salary: " + emp2.getSalary());

        // Calling the behavior of the second Employee object
        emp2.work();
        emp2.raiseSalary(7000);
        System.out.println("================\n\n");

        System.out.println("emp1 :: " + emp1);
        System.out.println("emp2 :: " + emp2);
       // double sal = emp1.salary + emp2.salary;
       // System.out.println("emp1.salary + emp2.salary = " + sal);


        emp1.setName("Nilesh");
        System.out.println(emp1.getName());
    }
}