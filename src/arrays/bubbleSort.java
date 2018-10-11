package arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        bubble_sort(input);

    }

    private static void bubble_sort(int[] array) {
        int k;

        for (int m = array.length; m >= 0; m--) {
            for (int i = 0; i < array.length - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }


        }
        for (int anArray : array) {
            System.out.println(anArray);
        }
    }

    private static void swapNumbers(int i, int j, int[] array) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

