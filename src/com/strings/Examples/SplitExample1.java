package com.strings.Examples;

public class SplitExample1 {
    public static void main(String[] args) {
        String text = "Apple,Banana,Cherry";
        String[] fruits = text.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
