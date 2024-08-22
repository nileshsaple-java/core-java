package com.strings.Examples;

public class Practice {

    public static void main(String[] args) {

        String str = new String("Hello");

        //find length using length method
        int length = str.length();

        //find character of specific index of string
        char ch = str.charAt(2);
        char ch1 = str.charAt(0);

        //substring Returns a new string that is a substring
        String sub = str.substring(1, 4); //here 1 is inclusive and 4 is exclusive
        //that's why it prints ell

        //using equal method to Compares this string to the specified object
        boolean isString = str.equals("Hello");
        boolean isString1 = str.equals("hello");

        //Convert the string to uppercase or lowercase
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();

        System.out.println(str);
        System.out.println(length);
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(sub);
        System.out.println(isString);
        System.out.println(isString1);
        System.out.println(upper);
        System.out.println(lower);
    }
}
