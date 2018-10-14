package arrays;

//Find Missing Number In Array [Facebook]

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class missingNumbers {
    public static void main(String[] args) {
        int[] input = {4, 2, 9, 6, 0, 1};

        List ans = missingNumber(input);

        System.out.println(ans);
    }

    private static List missingNumber(int[] input) {

        HashSet<Integer> set = new HashSet<>();
        List<Integer> temp= new ArrayList<>();
        int max = 0;
        for (int value: input){
            set.add(value);
            if(max < value){
                max = value;
            }
        }

        for(int i = 0, j = 0; i< max && j < input.length; i++) {
            if(set.contains(i)){
                j++;
            }else{
                temp.add(i);
            }
        }
        return temp;
    }
}
