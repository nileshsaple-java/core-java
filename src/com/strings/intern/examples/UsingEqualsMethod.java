package com.strings.intern.examples;

public class UsingEqualsMethod {
    public static void main(String[] args) {
        String name1 = "Hello";
        String name2 = "Hello";
        String name3 = "hello";
        String name4 = "HelLo";

        System.out.println(name1.equals(name2));//true
        System.out.println(name1.equals(name3));//false
        System.out.println("name1 :: "+ name1 + " \nname3 :: "+ name3);

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = new String("Hello");
        String str4 = new String("Hello");



        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true

        String str5 = str3.intern();
        System.out.println(str5);
        System.out.println(str4.toUpperCase());
        System.out.println(str4.toLowerCase());
        System.out.println(str4.charAt(2));
        System.out.println(str4.length());
        System.out.println(str4.substring(2,4));
        System.out.println(str4.replace('H', 'L'));
    }
}
