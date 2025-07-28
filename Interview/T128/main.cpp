#include <unordered_set>
#include <vector>
class Solution {
public:
  int longestConsecutive(std::vector<int> &nums) {
    std::unordered_set<int> s(nums.begin(), nums.end());
    int maxLen = 0;
    for (int num : s) {
      // 只有当 num-1 不在集合中，才从 num 开始找
      if (!s.count(num - 1)) {
        int current = num;
        int count = 1;
        while (s.count(current + 1)) {
          current++;
          count++;
        }
        maxLen = std::max(maxLen, count);
      }
    }
    return maxLen;
  }
};
