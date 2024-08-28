package com.array.examples;

public class ArrayUtil_1 {
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
class Main {
    public static void main(String[] args) {
        ArrayUtil_1 arrayUtil1 = new ArrayUtil_1();
        arrayUtil1.printArray(new int[] {12,43,21,233,21,33,11});
    }
}
