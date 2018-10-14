package arrays;
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]) {
        int num[] = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(num, target);

        for (int i : ans) {
            System.out.println(i);
        }
    }


    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];

        for(int i =0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]); //pass value to fetch the index
                result[1] = i; //index of 2nd number
            }else {
                map.put(nums[i],i); //key value: key is the number, value is the index.
            }
        }

        return result;


    }

}

