package com.strings.Examples;

public class StringPoolExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        // Both s1 and s2 refer to the same instance in the string pool
        System.out.println(s1 == s2); // Output: true

        String s3 = new String("Hello");
        String s4 = s3.intern();

        // s3 is a new object, but s4 refers to the instance in the string pool
        System.out.println(s1 == s3); // Output: false
        System.out.println(s1 == s4); // Output: true
    }
}