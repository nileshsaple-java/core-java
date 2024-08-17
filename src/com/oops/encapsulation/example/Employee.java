package com.oops.encapsulation.example;

public class Employee {

    //private fields
    private String name;
    private int age;
    private double salary;

    //public getter for name
    public String getName() {
        return name;
    }
    //public setter for name
    public void setName(String name) {
        this.name = name;
    }
    //public getter for age
    public int getAge() {
        return age;
    }

    //public setter for age with validation
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }else{
            System.out.println("Invalid age");
        }

    }
    //public getter for salary
    public double getSalary(){
        return salary;
    }

    //public setter for salary with validation
    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        }else{
            System.out.println("Invalid salary");
        }
    }
}

class main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        //setting values using setter
        emp.setName("Roshan Saple");
        emp.setAge(24);
        emp.setSalary(50000);

        //getting values using getter
        System.out.println("============================");
        System.out.println("Name : "+emp.getName());
        System.out.println("Age : "+emp.getAge()+ " years");
        System.out.println("Salary : "+emp.getSalary()+ " Per month");
        System.out.println("============================");
    }
}


