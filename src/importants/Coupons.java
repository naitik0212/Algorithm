package importants;

import java.util.HashMap;
import java.util.Map;

public class Coupons {
    public static void main(String args[]) {
           System.out.println(findLottery(100));
    }

    private static int findLottery(int n) {
        int a[] = new int[n];
        Map<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        int count = 0;
        for(int i = 1; i <= n; i++){
            int temp = i;
            int sum = 0;
            while(temp > 0) {
                sum = sum + temp % 10;
                temp = temp/10;
            }
            a[i-1] = sum;
            hm.put(sum, hm.getOrDefault(sum,0) +1);
            if(max < hm.get(sum)){
                max = hm.get(sum);
            }
        }

        System.out.println(hm);
        System.out.println(max);

        for(int i = 1; i < hm.size(); i++){
            if(hm.get(i) == max){
                count++;
            }
       }
        return count;
    }
}
