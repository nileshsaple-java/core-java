package com.practiceProgram;

public class MaxElementInArray {

    private static int[] getMaxNum() {
        int[] numbers = {12, 12, 32, 34, 23, 46, 46, 45, 75, 69, 98, 90, 23};
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = getMaxNum();
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}

