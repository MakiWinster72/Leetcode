#include <sstream>
#include <string>
#include <unordered_map>
#include <vector>
using namespace std;

class Solution {
public:
  bool wordPattern(string pattern, string s) {
    unordered_map<char, string> char_to_word;
    unordered_map<string, char> word_to_char;

    istringstream iss(s);
    vector<string> words;
    string word;
    while (iss >> word) {
      words.push_back(word);
    }

    if (pattern.length() != words.size())
      return false;

    for (int i = 0; i < pattern.length(); ++i) {
      char c = pattern[i];
      string w = words[i];

      // 未建立映射
      if (!char_to_word.count(c) && !word_to_char.count(w)) {
        char_to_word[c] = w;
        word_to_char[w] = c;
      } else {
        // 已建立映射但不一致
        if (char_to_word[c] != w || word_to_char[w] != c) {
          return false;
        }
      }
    }

    return true;
  }
};
