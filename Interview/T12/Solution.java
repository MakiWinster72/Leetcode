package Interview.T12;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String intToRoman(int num) {
        // 值数组，从大到小排序
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // 罗马字符数组，对应值数组
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", 
                            "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder(); // 用于拼接结果字符串

        // 遍历所有数值，从大到小匹配
        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                num -= values[i];        // 减去当前值
                sb.append(symbols[i]);   // 加上对应的罗马字符
            }
        }

        return sb.toString();  // 返回结果
    }
}
