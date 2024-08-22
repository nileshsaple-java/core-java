package com.strings.Examples;

public class SplitExample {
    public static void main(String[] args) {

        String test = "Apple,Banana,Orange";

        // Splitting the string by comma
        String[] fruits = test.split(",");

        // Iterating through the result and printing each element
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}