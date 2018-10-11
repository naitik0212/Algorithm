package arrays;

import java.util.HashSet;

public class duplicateNumbers {

    public static void main(String[] args) {
        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 8, 4, 2, 9, 0, 1};
        findDuplicates(input);

    }

    private static void findDuplicates(int[] input) {
        HashSet<Integer> set = new HashSet<>();
        for (int anArr : input)
            if(!set.add(anArr)){
                System.out.println(anArr);
            }else{
                set.add(anArr);
            }
    }
}


