package importants;

import java.util.Scanner;

public class JollyJumper {
    public static void main(String args[]) {
        int a[] = {4,1,4,2,3};
        jollyJumper(a);
    }

    private static void jollyJumper(int[] a) {
        int n = a.length;
        int index = 1;
        for(; index < n; index++) {

            if(Math.abs(a[index]-a[index-1]) > n){
                System.out.println("Not Jolly");
                break;
            }
        }
        if(index == n){
            System.out.println("Jolly");
        }
    }
}
