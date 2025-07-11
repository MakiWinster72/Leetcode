import Interview.T121.Solution;

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] prices = {7, 2, 100, 1, 6, 4};
        int res = sol.maxProfit(prices);

        System.out.println("最大利润是: " + res);
    }
}
