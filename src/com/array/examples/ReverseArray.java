package com.array.examples;

public class ReverseArray {

    public  void reverse(int[] numbers, int start, int end){
        while(start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 4, 7, 10, 6, 5};
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.printArray(numbers);
        reverseArray.reverse(numbers,0,numbers.length -1);
        reverseArray.printArray(numbers);

    }
}
