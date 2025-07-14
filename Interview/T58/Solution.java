package Interview.T58;

public class Solution {
    // 计算最后一个单词长度
    public int lengthOfLastWord(String s) {
        int len = s.length(), end = len - 1;

        // 从后往前跳过空格
        while (end >= 0 && s.charAt(end) == ' ') end--;

        // 计算非空格字符的长度
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') start--;

        return end - start;
    }
}
