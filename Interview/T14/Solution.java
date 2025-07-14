package Interview.T14;


public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 空数组直接返回空字符串
        if (strs == null || strs.length == 0) return "";

        // 取第一个字符串为初始公共前缀
        String prefix = strs[0];

        // 从第二个字符串开始比较
        for (int i = 1; i < strs.length; i++) {
            // 只要当前字符串不是以 prefix 开头，就不断缩短 prefix
            while (strs[i].indexOf(prefix) != 0) {
                // 缩短 prefix（去掉末尾一位）
                prefix = prefix.substring(0, prefix.length() - 1);

                // 如果缩短后变成空字符串，说明没有公共前缀
                if (prefix.isEmpty()) return "";
            }
        }

        // 返回所有字符串的最长公共前缀
        return prefix;
    }
}

