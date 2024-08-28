package com.practiceProgram;

/**
 * input = line = Hello I am learning java
 * String [] lineArray = line.split(" ")
 */

public class PrintWords {

    private static void printWord(String line) {
        String[] lineArray = line.split(" ");
        for (String word : lineArray) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String line = "Hello I am learning java";
        printWord(line);
    }
}
