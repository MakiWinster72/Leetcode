class Solution {
public:
  bool isIsomorphic(string s, string t) {
    if (s.length() != t.length())
      return false;

    int map_s_t[256] = {0}; // s -> t
    int map_t_s[256] = {0}; // t -> s

    for (int i = 0; i < s.length(); ++i) {
      char sc = s[i];
      char tc = t[i];

      if (map_s_t[sc] == 0 && map_t_s[tc] == 0) {
        map_s_t[sc] = tc;
        map_t_s[tc] = sc;
      } else {
        if (map_s_t[sc] != tc || map_t_s[tc] != sc) {
          return false;
        }
      }
    }

    return true;
  }
};
