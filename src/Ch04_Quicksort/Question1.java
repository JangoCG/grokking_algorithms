package Ch04_Quicksort;

import java.util.Arrays;

public class Question1 {

    public static int recursiveSum(int[] arr) {
        if(arr.length <= 0) {
            return 0;
        } else {
            return arr[0] + recursiveSum(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }

    public static int maximumNumber(int[] input) {

        int maxNumber = 0;

        if(input.length == 2) {
            return 0;
        }

        else {
//            return Arrays.copyOfRange(input, 1, input.length);
        }

        return maxNumber;
    }


    public static void main(String[] args) {
        System.out.println("hello world");
        int[] array = {2,4,6};

        int[] maximumNumber = {1,2,3};

        System.out.println(maximumNumber(maximumNumber));
    }
}
