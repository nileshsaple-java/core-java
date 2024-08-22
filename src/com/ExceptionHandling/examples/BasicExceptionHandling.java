package com.ExceptionHandling.examples;

public class BasicExceptionHandling {
    public static void main(String[] args) {
        //code that might throw an exception.
        try {
            int result = divide(10, 0);// This will cause ArithmeticException
            System.out.println(result);
        } catch (Exception e) {   //Handles the exception if it occurs.
            System.out.println("Error : can not divisible by zero");

        } finally {  //Executes regardless of whether an exception occurred or not.
            //Useful for closing resources or cleanup.
            System.out.println("This block always executed");
        }
    }

    //Method
    public static int divide(int a, int b) {
        return a / b;
    }
}
