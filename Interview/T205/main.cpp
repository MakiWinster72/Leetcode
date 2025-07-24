#include <unordered_map>
class Solution {
public:
  bool isIsomorphic(string s, string t) {
    if (s.length() != t.length())
      return false;

    std::unordered_map<char, char> map_s_t;
    std::unordered_map<char, char> map_t_s;
  };
