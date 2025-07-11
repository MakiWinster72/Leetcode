package Interview.T189;

public class Solution {
    public void rotate(int[] nums, int k) {
    //     k = k %nums.length;

    //     int[] nums1 = new int[k];
    //     int size = nums.length;
    //     for (int i = 0; i < k; i++) {
    //         nums1[i] = nums[size - k + i];
    //     }

    //     for (int i = size - 1; i >= k; i--) {
    //         nums[i] = nums[i - k];
    //     }

    //     for (int i = 0; i < k; i++) {
    //         nums[i] = nums1[i];
    //     }
    // }
    // O(n) O(k)

    // 翻转法
    k = k % nums.length;

    reverse(0, nums.length - 1, nums);
    reverse(0, k - 1, nums);
    reverse(k, nums.length - 1, nums);
    }

    void reverse(int i, int j, int[] nums) {
        while (i < j) {
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }

}