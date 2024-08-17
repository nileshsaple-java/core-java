package array;

public class FindMinimumNumber {
    public int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,2,8,3,-6,77,60};
        FindMinimumNumber fm = new FindMinimumNumber();
        System.out.println(fm.findMinimum(arr));
    }

}



