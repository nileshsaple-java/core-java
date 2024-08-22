package com.ExceptionHandling.examples;

public class CustomExceptionUsage {
    public static void main(String[] args) {
        try {
            validateInput("Invalid_Input");
        } catch (CustomException e) {
            System.out.println("Caught CustomException." + e.getMessage());
        }
    }

    public static void validateInput(String input) throws CustomException {
        if ("Invalid_Input".equals(input)) {
            throw new CustomException("Input is Invalid");
        }
        System.out.println("Input is valid");
    }
}
