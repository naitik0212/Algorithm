package arrays;

public class largestSmallestInArray {
    public static void main(String args[]){
        int[] a = { -20, 34, 21, -87, 92, 2147483647};
        findElement(a);
    }

    private static void findElement(int[] a) {
        int smallest = a[0];
        int largest = a[0];
        for(int i =1; i< a.length;i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            } else if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println("Smallest: " + smallest + " and Largest: "+ largest);
    }
}
