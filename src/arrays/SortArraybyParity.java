package arrays;

import java.util.ArrayList;
import java.util.List;

public class SortArraybyParity {
    private static int[] sortArrayByParity(int[] A) {
        for (int i = 0, j = 0; j < A.length; j++)
            if (A[j] % 2 == 0) {
                int tmp = A[i];
                A[i++] = A[j];
                A[j] = tmp;
            }
        return A;
    }

    public static void main(String[] args) {
        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 8, 4, 2, 9, 0, 1};
        int a[] = sortArrayByParity(input);
        for(int i: a){
            System.out.print(i + ", ");
        }

    }
}
