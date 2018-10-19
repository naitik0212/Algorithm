package arrays;

import java.util.ArrayList;
import java.util.List;

public class selfDividingNumber {

        private static List<Integer> selfDividingNumbers(int left, int right) {
                ArrayList ans = new ArrayList();
                for (int n = left; n <= right; ++n) {
                    if (selfDividing(n)) ans.add(n);
                }
                return ans;
            }

    public static boolean selfDividing(int n) {
        int x = n;
        while (x > 0) {
            int d = x % 10;
            x /= 10;
            if (d == 0 || (n % d) > 0) return false;
        }
        return true;
    }

        public static void main(String[] args) {
            List<Integer> ans = selfDividingNumbers(1,22);
            System.out.println(ans);
        }

}

