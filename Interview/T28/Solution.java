package Interview.T28;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        int hLen = haystack.length();
        int nLen = needle.length();

        // 遍历 haystack 的每个可能的起始位置
        for (int i = 0; i <= hLen - nLen; i++) {
            // 截取长度相同的子串，判断是否匹配
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
