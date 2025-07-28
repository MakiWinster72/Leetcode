#include <unordered_map>
#include <unordered_set>
#include <vector>

class Solution {
public:
  bool containsNearbyDuplicate(vector<int> &nums, int k) {
    // for (int i = 0; i < nums.size(); ++i) {
    //   for (int j = i + 1; j < nums.size() && j <= i + k; ++j) {
    //     if (nums[i] == nums[j]) return true;
    //   }
    // }
    // return false;

    // 哈希集合+活动窗口
    //  std::unordered_set<int> window;
    //  for (int i = 0; i < nums.size(); ++i) {
    //    if (window.count(nums[i])) return true;
    //    window.insert(nums[i]);
    //    if (window.size() > k) {
    //      window.erase(nums[i - k]);
    //    }
    //  }
    //  return false;

    std::unordered_map<int, int> lastIndex;
    for (int i = 0; i < nums.size(); ++i) {
      if (lastIndex.count(nums[i]) && i - lastIndex[nums[i]] <= k) {
        return true;
      }
      lastIndex[nums[i]] = i;
    }
    return false;
  }
};
