#include <unordered_set>
class Solution {
public:
  bool isHappy(int n) {
    std::unordered_set<int> seen;
    while (n != 1 && !seen.count(n)) {
      seen.insert(n);
      n = getSum(n);
    }

    return n == 1;
  }

private:
  int getSum(int n) {
    int sum = 0;
    while (n) {
      int d = n % 10;
      sum += d * d;
      n /= 10;
    }

    return sum;
  }
};
