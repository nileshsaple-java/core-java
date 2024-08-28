package com.practiceProgram;

/**
 * Write a program to print each character of given String
 */
public class PrintCharacter {
    private static void printCharacter(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String name = "Roshan";
        printCharacter(name);
    }
}
