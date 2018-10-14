package arrays;
//Find the smallest +ve integer element not in array

import java.util.HashSet;

public class findSmallestElementNotInArray {
    public static void main(String args[]){
        int a[] = {-1, 1, -3, 2, 4, 3, 5};
        int ans = smallestPostiveElementNotInArray(a);
        System.out.println(ans);

    }

    private static int smallestPostiveElementNotInArray(int[] a) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: a){
            set.add(i);
            }

        for(int i =0, j=1; i < a.length; i++){
            if(!set.contains(j)){
                return j;
            }else{
                j++;
            }
        }
        return a[a.length-1]+1;
        }
}

