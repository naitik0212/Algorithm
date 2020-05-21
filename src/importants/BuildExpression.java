package importants;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BuildExpression {

    public static void main(String[] args) {
        Set<List<Integer>> set = new HashSet<>();
        choose(1, new int[5], 0, set);
        System.out.println(set.size());
    }

    /**
     * Given numbers 1 through 52, take 5 unique numbers and determine if the
     * number 42 can be made using any combination of addition (+), subtraction
     * (-), multiplication (*), and division (/) on those 5 numbers
     */

    public static void choose(int n, int[] nums, int ind, Set<List<Integer>> set) {
        if (n > 52)
            return;
        if (ind == 5) {
            check(nums, new ArrayList<Integer>(), 0, set);
            return;
        }

        nums[ind] = n;
        choose(n + 1, nums, ind + 1, set);
        choose(n + 1, nums, ind, set);
    }

    public static void check(int[] nums, List<Integer> list, int ind, Set<List<Integer>> set) {

        if (ind > 4) {
            int sum = 0;
            for (int i : list)
                sum += i;
            if (sum == 42) {
                List<Integer> s = new ArrayList<>();
                for (int i = 0; i < nums.length; i++) {
                    s.add(nums[i]);
                }
                set.add(s);
                //System.out.println(set);
            }
            return;
        }

        // for add
        list.add(nums[ind]);
        check(nums, list, ind + 1, set);
        list.remove(new Integer(nums[ind]));

        // for subtract
        list.add(-nums[ind]);
        check(nums, list, ind + 1, set);
        list.remove(new Integer(-nums[ind]));

        // for multiply
        int get = 1;
        if (list.size() > 0) {
            get = list.get(list.size() - 1);
            list.remove(list.size() - 1);
        }
        list.add(get * nums[ind]);
        check(nums, list, ind + 1, set);
        list.remove(new Integer(get * nums[ind]));
        list.add(get);

        // for divide
        get = 1;
        if (list.size() > 0) {
            get = list.get(list.size() - 1);
            list.remove(list.size() - 1);
        }
        list.add(get / nums[ind]);
        check(nums, list, ind + 1, set);
        list.remove(new Integer(get / nums[ind]));
        list.add(get);

    }
}