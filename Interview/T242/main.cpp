class Solution {
public:
  bool isAnagram(string s, string t) {
    if (s.length() != t.length())
      return false;

    int cLetters[26] = {0};

    for (char c : s) {
      cLetters[c - 'a']++;
    }

    for (char c : t) {
      cLetters[c - 'a']--;
      if (cLetters[c - 'a'] < 0)
        return false; // ✅ 修正条件
    }

    return true;
  }
};
