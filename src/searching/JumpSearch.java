package searching;
//referred from geeksforgeeks
public class JumpSearch {
    public static void main(String args[]){
        int a[] = {2,3,4,5,6,67,23,421,42,12,422,64};
        int findElement = 25;
        int findElement1 = 4;
        System.out.println("Element "+ findElement + " found at position " + jumpSearch(a,findElement));
        System.out.println("Element "+ findElement1 + " found at position " + jumpSearch(a,findElement1));
    }

    private static int jumpSearch(int[] a, int findElement) {
        int n = a.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;
        while (a[Math.min(step,n)-1]< findElement) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        while (a[prev] < findElement)
        {
            prev++;

            if (prev == Math.min(step, n))
                return -1;
        }

        if (a[prev] == findElement)
            return prev;

        return -1;
    }
}
