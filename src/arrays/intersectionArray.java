package arrays;
//find first common element in arrays


import java.util.ArrayList;
import java.util.List;

public class intersectionArray {
    public static void main(String args[]){
        int[] a = { 1, 2, 3, 6, 8, 10, 11};
        int[] b = { 4, 5, 6, 11, 15, 20 };

        int ans = intersectionElement(a,b);
        System.out.println("First Common Element is " + ans);



        intersectionArrayList(a,b);

    }
    private static int intersectionElement(int[] a, int[] b) {
        for(int i = 0, j =0; i < a.length && j<b.length; ){
            if(a[i]==b[j]){
                return (a[i]);
            }else if(a[i]>b[j]){
                j++;
            }else{
                i++;
            }
        }
        return -1;
    }

    private static void intersectionArrayList(int[] a, int[] b) {
//        List<Integer> ans = new ArrayList<>();
        System.out.println("All Common Elements: ");
        for(int i = 0, j =0; i < a.length && j<b.length; ){
            if(a[i]==b[j]){
                System.out.print(a[i]+ " ");
                i++;
                j++;
            }else if(a[i]>b[j]){
                j++;
            }else{
                i++;
            }
        }
    }
}

