package Interview.T169;

public class Solution {
    // 返回数组中出现次数最多的元素
    public int majorityElement(int[] nums) {
        // 初始化计数器和候选元素
        int count = 0, candidate = 0;

        // 遍历数组
        for (int num : nums) {
            // 如果计数器为0，则将当前元素设为候选元素
            if (count == 0) {
                candidate = num;
            }
            // 如果当前元素等于候选元素，则计数器加1，否则计数器减1
            count += (num == candidate) ? 1 : -1;
        }

        // 返回候选元素
        return candidate;
    }
}
