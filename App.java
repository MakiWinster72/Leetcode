import Interview.T14.Solution;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] input1 = {"flower", "flow", "flight"};
        String[] input2 = {"dog", "racecar", "car"};
        String[] input3 = {"interview", "internet", "internal", "interval"};

        System.out.println("测试1: " + solution.longestCommonPrefix(input1)); // fl
        System.out.println("测试2: " + solution.longestCommonPrefix(input2)); // （空字符串）
        System.out.println("测试3: " + solution.longestCommonPrefix(input3)); // inte
    }
}
