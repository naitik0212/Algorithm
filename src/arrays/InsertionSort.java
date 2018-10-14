package arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        insertion_sort(input);
    }

    private static void insertion_sort(int[] input) {
        int n = input.length;
        for (int i=1; i<n; ++i)
        {
            int key = input[i];
            int j = i-1;

            while (j>=0 && input[j] > key)
            {
                input[j+1] = input[j];
                j = j-1;
            }
            input[j+1] = key;
        }
        for (int anArr : input)
            System.out.println(anArr);
    }
}

