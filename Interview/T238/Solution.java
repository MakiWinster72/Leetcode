package Interview.T238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int zeroCount = 0;
        int totalProduct = 1;

        // 统计 0 的个数，并计算非 0 的乘积
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
                if (zeroCount == 2) break;
                if (zeroCount > 1) break;
            } else {
                totalProduct *= num;
            }
        }

        if (zeroCount > 1) {
            // 如果有两个及以上的 0，结果全是 0
            return res; // 默认值就是全 0
        } else if (zeroCount == 1) {
            // 只有一个 0，只有该 0 位置为乘积，其他为 0
            for (int i = 0; i < n; i++) {
                res[i] = (nums[i] == 0) ? totalProduct : 0;
            }
        } else {
            // 没有 0，正常计算前缀 × 后缀积
            res[0] = 1;
            for (int i = 1; i < n; i++) {
                res[i] = res[i - 1] * nums[i - 1];
            }

            int right = 1;
            for (int i = n - 1; i >= 0; i--) {
                res[i] *= right;
                right *= nums[i];
            }
        }

        return res;
    }
}
