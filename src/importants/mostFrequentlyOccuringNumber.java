package importants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class mostFrequentlyOccuringNumber {
    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(333);
        list.add(9);
        list.add(1);
        list.add(12);
        list.add(1);
        list.add(8);
        list.add(1);
        list.add(47);
        list.add(59);
        list.add(91);
        list.add(32);
        list.add(1);
        list.add(1);
        list.add(1);

        System.out.println("Max element of list is " + Collections.max(list));

        int p[] =  findMode(list);

        System.out.println("number " + p[1] + " occurs maximum for " + p[0] + " times in the list.");


    }

    private static int[] findMode(List<Integer> list) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxCount = 0;
        int maxValue = Integer.MIN_VALUE;

        for (Integer aList : list) {
            if (map.containsKey(aList)) {
                map.put(aList, map.get(aList) + 1);
            } else {
                map.put(aList, 1);
            }

            if (map.get(aList) > maxCount) {
                maxValue = aList;
                maxCount = map.get(maxValue);
            }
        }
        return new int[] {maxCount,maxValue};
    }
}
