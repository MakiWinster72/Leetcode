package Interview.T13;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        // 创建一个哈希表（map），用于存储罗马数字对应的整数数值
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1); // I = 1
        map.put('V', 5); // V = 5
        map.put('X', 10); // X = 10
        map.put('L', 50); // L = 50
        map.put('C', 100); // C = 100
        map.put('D', 500); // D = 500
        map.put('M', 1000);// M = 1000

        // 用来保存转换后的整数总值
        int total = 0;
        // 获取字符串长度
        int n = s.length();

        // 遍历字符串中每一个字符（除了最后一个）
        for (int i = 0; i < n - 1; i++) {
            // 获取当前字符代表的整数
            int curr = map.get(s.charAt(i));
            // 获取下一个字符代表的整数
            int next = map.get(s.charAt(i + 1));

            // 如果当前字符小于下一个字符，说明是“减法情况”，如 IV = 4（5 - 1）
            if (curr < next)
                total -= curr; // 减去当前的值
            else
                total += curr; // 否则正常加上当前值
        }

        // 循环只遍历到倒数第二个字符，这里单独加上最后一个字符的值
        total += map.get(s.charAt(n - 1));

        // 返回最终计算结果
        return total;
    }

}
