package Interview.T134;

public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;   // 总净油量
        int tank = 0;    // 当前油量
        int start = 0;   // 起点

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;

            if (tank < 0) {
                // 当前不能作为起点，从下一站重新开始
                start = i + 1;
                tank = 0;
            }
        }

        return total < 0 ? -1 : start;
    }
}
