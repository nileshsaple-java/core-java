package com.ExceptionHandling.examples;

public class ThrowAndThrowsExample {
    public static void main(String[] args) {
        try {
            validateAge(18); // This will throw CustomException
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or older.");
        }
        System.out.println("Age is valid.");
    }
}
