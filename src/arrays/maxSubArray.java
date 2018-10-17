package arrays;

//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

public class maxSubArray {
    public static void main(String[] args) {
        int[] input = {4, 2, 9, 6, -23, 12, -34, 0, 8, -4, 2, -9, 0, 1};
        int a = maximumSubarray(input);
        System.out.println(a);

    }

    private static int maximumSubarray(int[] input) {

        int[] temp = new int[input.length];
        int max = input[0];
        temp[0] = input[0];

        for(int i = 1; i < input.length; i++ ) {
            if(temp[i-1]>0) {
                temp[i] = temp[i-1];
            }else {
                temp[i] = 0;
            }

            temp[i] = input[i] + temp[i];

            max = Math.max(max, temp[i]);
        }

        return max;
    }
}
