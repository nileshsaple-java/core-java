package com.strings.equalsAndDoubleEquals;

public class Main {
    public static void main(String[] args) {
        // Case 1: Using string literals (both point to the same object in the String Pool)
        String str1 = "Hello";
        String str2 = "Hello";
        
        // Case 2: Using 'new' keyword (different objects in the heap, same content)
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        
        // Comparing references using '=='
        System.out.println(str1 == str2);  // true - Both refer to the same object in String Pool
        System.out.println(str3 == str4);  // false - Different objects in heap memory
        
        // Comparing content using 'equals()'
        System.out.println(str1.equals(str2));  // true - Same content
        System.out.println(str3.equals(str4));  // true - Same content
    }
}
