package importants;

public class JumpGame {

    public boolean canJumpFromPosition(int position, int[] nums) {
        if (position == nums.length - 1) {
            return true;
        }

        int furthestJump = Math.min(position + nums[position], nums.length - 1);
        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
            if (canJumpFromPosition(nextPosition, nums)) {
                return true;
            }
        }

        return false;
    }


    public boolean canJump(int[] nums) {
        return canJumpFromPosition(0, nums);
    }

    public static void main(String args[]) {
        JumpGame a = new JumpGame();
        int arr[] = {2, 3, 1, 1, 4};
//        System.out.println(a.canJump(arr));

        Solution1 ab = new Solution1();
        System.out.println(ab.canJump(arr));

    }

}
     class Solution1 {
        public boolean canJump(int[] nums) {
            int lastPos = nums.length - 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (i + nums[i] >= lastPos) {
                    lastPos = i;
                }
            }
            return lastPos == 0;
        }
    }

