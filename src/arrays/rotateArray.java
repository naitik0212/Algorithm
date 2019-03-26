package arrays;

public class rotateArray {
    public static void main(String args[]) {
        int a[] = {1,2,3,4,5,6,7,8};
        rotateArrayByK(a,3);
    }


    private static void rotateArrayByK(int[] a, int k){
        k = k%a.length;
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        reverse(a,0,a.length-1);
        for(int i: a){
            System.out.print(i + " ");
        }
    }

    private static void reverse(int a[], int start, int end ){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

}
