package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public static void main(String args[]) {
        int num[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = threeSum(num);

        System.out.println(ans);


    }

    private static List<List<Integer>> threeSum(int[] input) {
        Arrays.sort(input);
        List<List<Integer>> ans = new LinkedList<>();

        for (int i = 0; i < input.length-2; i++) {
            if (i == 0 || (input[i] != input[i-1])) {

                int low = i+1,
                        high = input.length-1,
                        sum = 0 - input[i];

                while (low < high) {
                    if (input[low] + input[high] == sum) {
                        ans.add(Arrays.asList(input[i], input[low], input[high]));

                        while ((low < high) && input[high] == input[high - 1]){
                                high--;
                        }
                        while ((low < high) &&(input[low] == input[low+1])){
                                low++;
                        }
                        low++;
                        high--;
                    } else if(input[low] + input[high] < sum)
                        low++;
                    else
                        high--;
                }
            }
        }

        return ans;
    }
}
