package arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        selection_sort(input);
    }

    private static void selection_sort(int[] input) {
        int n = input.length;

        for(int i = 0; i < n; i++) {
            int min_index = i;
            for(int j = i+1; j < n; j++){
                if(input[j]< input[min_index]){
                    min_index = j;}

                int temp = input[min_index];
                input[min_index] = input[i];
                input[i] = temp;
            }
        }
        for (int i=0; i < n; ++i)
            System.out.println(input[i]);
    }
}

