package arrays;

public class productExceptSelf {

    public static void main(String[] args) {
        int[] input = {1,2,3,4};
        int ans[] = productExceptSelf(input);

        for(int value: ans){
           System.out.print(value+ " ");
        }
    }

    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
