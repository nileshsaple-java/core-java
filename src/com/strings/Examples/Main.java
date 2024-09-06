package com.strings.Examples;

public class Main {
    public static void main(String[] args) {
        // Case 1: Using string literals (both point to the same object in the String Pool)
        String str1 = "Hello";
        String strI1 = str1.intern();

        String str2 = "Hello";

        //String str100 = "Hello";
        //String str100 = str1.intern();

        String str11 = "hello";
        String strI11 = str11.intern();

        System.out.println("str1 :: "+str1);
        System.out.println("strI1 :: "+strI1);
        System.out.println("strI11 :: "+str11);
        System.out.println("strI11 :: "+strI11);
        System.out.println("str1 hashcode :: "+System.identityHashCode(str1));
        System.out.println("strI1 hashcode :: "+System.identityHashCode(strI1));
        System.out.println("str11 hashcode :: "+System.identityHashCode(str11));
        System.out.println("strI11 hashcode :: "+System.identityHashCode(strI11));

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