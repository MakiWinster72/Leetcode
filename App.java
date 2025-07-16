import Interview.T68.Solution;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] words = {
            "This", "is", "an", "example", "of", "text", "justification."
        };
        int maxWidth = 16;

        List<String> justified = solution.fullJustify(words, maxWidth);
        for (String line : justified) {
            System.out.println("|" + line + "|"); // 加竖线用于可视化空格
        }
    }
}
