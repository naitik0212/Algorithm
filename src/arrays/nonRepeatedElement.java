package arrays;
//array with every element repeated twice except one. Find that element

import java.util.Arrays;
import java.util.List;

public class nonRepeatedElement {
    public static void main(String[] args) {
        int[] input = {1,1,2,2,3,4,4};
        int size = input.length;

        int ans = uniqueElement(input, size);
        System.out.println(ans);

    }

    private static int uniqueElement(int arr[], int n)
    {
        int result = 0;

        for(int i:arr)
        {
            result ^=i;
        }
        return result;
    }
}
