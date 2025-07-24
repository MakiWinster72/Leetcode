#include <climits>
#include <iostream>
#include <string>
#include <unordered_map>
#include <vector>
using namespace std;

class Solution {
public:
  string minWindow(string s, string t) {
    unordered_map<char, int> need, window;
    for (char c : t)
      need[c]++;

    int left = 0, right = 0;
    int valid = 0;
    int start = 0, len = INT_MAX;

    while (right < s.size()) {
      char c = s[right];
      right++;
      if (need.count(c)) {
        window[c]++;
        if (window[c] == need[c])
          valid++;
      }

      while (valid == need.size()) {
        if (right - left < len) {
          start = left;
          len = right - left;
        }
        char d = s[left];
        left++;
        if (need.count(d)) {
          if (window[d] == need[d])
            valid--;
          window[d]--;
        }
      }
    }

    return len == INT_MAX ? "" : s.substr(start, len);
  }
};

void runTest(string s, string t) {
  Solution sol;
  string result = sol.minWindow(s, t);
  cout << "输入: s = \"" << s << "\", t = \"" << t << "\"\n";
  cout << "最小覆盖子串: \"" << result << "\"\n\n";
}

int main() {
  runTest("ADOBECODEBANC", "ABC"); // "BANC"
  runTest("a", "a");               // "a"
  runTest("a", "aa");              // ""
  runTest("ab", "b");              // "b"
  return 0;
}
