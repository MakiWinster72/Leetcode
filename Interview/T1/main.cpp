#include <unordered_map>
#include <vector>
class Solution {
public:
  std::vector<int> twoSum(std::vector<int> &nums, int target) {
    std::unordered_map<int, int> hash;
    for (int i = 0; i < nums.size(); ++i) {
      int need = target - nums[i];
      if (hash.count(need)) {
        return {hash[need], i};
      }
      hash[nums[i]] = i;
    }
    return {};
  }
};
