package com.array.examples;

public class practiceArray {
    public static void main(String[] args) {
        int[] a = new int[4];
        a[0] = 1;
        a[1] = 1;
        a[2] = 1;
        a[3] = 1;

        //For each loop
        for(int b : a) {
            System.out.print(" "+b);
        }
        System.out.println();
         for(int i = 0; i < a.length; i++) // Array traversal
        System.out.print(" "+a[i]);
    }
}
