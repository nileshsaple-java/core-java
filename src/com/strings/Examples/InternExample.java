package com.strings.Examples;

public class InternExample {
    public static void main(String[] args) {
        // Creating strings using new keyword (stored in heap memory)
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        
        // Comparing with == (will be false since they are different objects)
        System.out.println(str1 == str2);  // Output: false

        System.out.println("str1 :: "+System.identityHashCode(str1));
        System.out.println("str2 :: "+System.identityHashCode(str2));

        // Using intern() method
        String str3 = str1.intern();
        String str4 = str2.intern();

        System.out.println("str1 :: "+System.identityHashCode(str1));
        System.out.println("str2 :: "+System.identityHashCode(str2));

        
        // Comparing with == after interning (will be true since they point to the same object in the String Pool)
        System.out.println(str3 == str4);  // Output: true
        
        // Comparing with == to a literal string (will also be true)
        String str5 = "Hello";
        System.out.println(str3 == str5);  // Output: true
    }
}
