package com.strings.intern.examples;

public class UsingDoubleEqualOperator {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.print("str1 == str2 :: "); // false
        System.out.println(str1 == str2); // false

        String str3 = str2.intern();
        System.out.println(str3);

        String name1 = "Roshan";
        String name2 = "Roshan";
        String name3 = "roshan";
        String name4 = "Roshan";
        String name5 = name3.intern();
        System.out.println(name1 == name2);//true
        System.out.println(name1 == name4);//true
        System.out.println(name1 == name3);//false
        System.out.println(name5);// roshan
    }
}
