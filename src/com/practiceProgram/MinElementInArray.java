
package com.practiceProgram;

public class MinElementInArray {

    private static int getMinNum(int[] numbers) {

        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 43, 23, 24, 23, 23, 45, 67, 534, 12, 45, 6, 78, 909, 9};
         int min = getMinNum(numbers);

        System.out.println(min);
    }
}

