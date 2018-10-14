package arrays;

//Given an unsorted array of numbers that can repeat, return the list of elements sorted in ascending based on frequency.

import java.util.HashMap;
import java.util.Map;

public class elementFreqinArray {
    public static void main(String args[]){
        int a[] = {3,1,2,4,5,4,5,6};
        sortFreq(a);
    }
    private static void sortFreq(int[] a) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for (int key : a) {
            if (ans.containsKey(key)) {
                ans.put(key, ans.get(key) + 1);
            } else {
                ans.put(key, 1);
            }
        }

        ans.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(e -> System.out.println(e.getKey()));
    }
}
