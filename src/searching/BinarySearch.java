package searching;

public class BinarySearch {
    public static void main(String args[]) {
        int a[] = {1,2,3,4,5,6,7,8};
        int element = 4;
        int result_i = (binarySearchIterative(a,element));
        int low = 0;
        int high = a.length - 1;
        int result_r = (binarySearchRecursive(a, low, high, element));

        if (result_i == -1)
            System.out.println("Element not present (Iterative Approach)");
        else
            System.out.println("Element found at index (Iterative Approach) " +
                    result_i);

        if (result_r == -1)
            System.out.println("Element not present (Recursive Approach)");
        else
            System.out.println("Element found at index (Recursive Approach) " +
                    result_r);

}

    private static int binarySearchRecursive(int[] a, int low, int high, int element) {
        if(high >= low) {
            int mid = low + (high-low)/2;

            if(a[mid]==element) {
                return mid;
            } else if(a[mid] > element) {
                return binarySearchRecursive(a,low,mid-1,element);
            } else {
                return binarySearchRecursive(a,low + mid,high,element);
            }
        }
        return -1;

    }

    private static int binarySearchIterative(int[] a, int element) {
        int low = 0;
        int high = a.length - 1;

        while (low<high) {
            int mid = low + (high - low)/2; //to avoid overflow

            if(a[mid] == element) {
                return mid;
            } else if(a[mid] < element) {
                low = mid + low;
            }else{
                high = mid - 1;
            }

        }
        return -1;

    }
}
