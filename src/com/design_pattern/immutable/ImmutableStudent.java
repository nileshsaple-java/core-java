package com.design_pattern.immutable;

public final class ImmutableStudent {
    // Fields are private and final
    private final String name;
    private final int rollNumber;

    // Constructor to initialize the fields
    public ImmutableStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Only getter methods (no setters)
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // No setters to modify fields
}

class Main {
    public static void main(String[] args) {
        // Creating an immutable student object
        ImmutableStudent student = new ImmutableStudent("John Doe", 101);

        // Accessing the student's information
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());

        // Any attempt to modify the object will fail as there are no setters
        // student.setName("Jane Doe"); // Compilation error (no setName method)
    }
}

