package Interview.T55;

public class Solution {
    public boolean canJump(int[] nums) {
        // 贪心 2ms
        // int maxReach = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (i > maxReach) return false;
        //     maxReach = Math.max(maxReach, i + nums[i]);
        // }

        // return true;


        // 反向贪心 问题化简  1ms
        int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }

        return goal == 0;
    }
}
