package searching;

public class LinearSearch {
    public static void main(String args[]){
        int a[] = {2,3,4,5,6,67,23,421,42,12,422,64};
        int findElement = 25;
        int findElement1 = 4;
        System.out.println("Element "+ findElement + " found at position " + linearSearch(a,findElement));
        System.out.println("Element "+ findElement1 + " found at position " + linearSearch(a,findElement1));
    }

    private static String linearSearch(int[] a, int e) {
        for(int i = 0; i < a.length; i++) {
            if(a[i]==e) {
                return Integer.toString(i);
            }
        }
        return "-1";
    }
}
