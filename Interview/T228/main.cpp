#include <string>
#include <vector>
class Solution {
public:
  std::vector<std::string> summaryRanges(std::vector<int> &nums) {
    std::vector<std::string> res;
    if (nums.empty())
      return res;

    int start = nums[0], end = nums[0];
    for (int i = 1; i < nums.size(); ++i) {
      if (nums[i] == end + 1) {
        end = nums[i];
      } else {
        res.push_back(formatRange(start, end));
        start = end = nums[i];
      }
    }
    res.push_back(formatRange(start, end));
    return res;
  }

private:
  std::string formatRange(int start, int end) {
    if (start == end)
      return std::to_string(start);
    else
      return std::to_string(start) + "->" + std::to_string(end);
  }
};
