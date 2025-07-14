package Interview.T45;

public class Solution {
    public int jump(int[] nums) {
        // int jumps = 0;      // 跳跃次数
        // int end = 0;        // 当前跳跃覆盖的最远范围
        // int farthest = 0;   // 下一跳能到达的最远位置

        // for (int i = 0; i < nums.length - 1; i++) {
        //     farthest = Math.max(farthest, i + nums[i]);

        //     if (end == nums.length - 1) return jumps;
        //     if (i == end) {
        //         jumps++;
        //         end = farthest;
        //     }
        // }

        // 反向贪心，过于依赖循环 13ms
        int end = nums.length - 1;
        int steps = 0;

        while (end > 0) {
            for (int i = 0; i < end; i++) {
                if (i + nums[i] >= end) {
                    end = i;
                    steps++;
                    break;
                }
            }
        }

        return steps;
    }
}
