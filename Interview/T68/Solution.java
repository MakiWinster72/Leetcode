package Interview.T68;

import java.util.*;

public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int lineLen = words[i].length();
            int j = i + 1;

            // 尽可能多装单词，不超过maxWidth
            while (j < words.length && lineLen + 1 + words[j].length() <= maxWidth) {
                lineLen += 1 + words[j].length();
                j++;
            }

            int numWords = j - i;
            int totalChars = 0;
            for (int k = i; k < j; k++) totalChars += words[k].length();

            int totalSpaces = maxWidth - totalChars;
            StringBuilder line = new StringBuilder();

            // 最后一行 or 只有一个单词，左对齐
            if (j == words.length || numWords == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k != j - 1) line.append(" ");
                }
                while (line.length() < maxWidth) line.append(" ");
            } else {
                int avgSpace = totalSpaces / (numWords - 1);
                int extra = totalSpaces % (numWords - 1);
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k != j - 1) {
                        for (int s = 0; s < avgSpace + (k - i < extra ? 1 : 0); s++)
                            line.append(" ");
                    }
                }
            }

            res.add(line.toString());
            i = j;
        }

        return res;
    }
}
