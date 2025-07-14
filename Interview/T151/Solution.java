package Interview.T151;

public class Solution {
    public String reverseWords(String s) {
        if (s == null) return "";

        // 按空格拆分，可能有空字符串
        String[] words = s.trim().split("\\s+");
        // int i = 0;
        // int j = words.length - 1;
        // while (i < j) {
        //     String tmp = words[i];
        //     words[i] = words[j];
        //     words[j] = tmp;
        //     i++;
        //     j--;
        // }

        StringBuilder sb = new StringBuilder();
        for (int k = words.length - 1; k >= 0; k--) {
            sb.append(words[k]);
            if (k != 0) sb.append(" ");
        }

        return sb.toString();

        // StringBuilder sb = new StringBuilder();
        // // 倒序遍历单词数组
        // for (int i = words.length - 1; i >= 0; i--) {
        //     sb.append(words[i]);
        //     if (i != 0) sb.append(" ");
        // }
        // return sb.toString();
    }
}
