#include <stack>
#include <string>
class Solution {
public:
  bool isValid(std::string s) {
    std::stack<char> stk;
    for (char c : s) {
      if (c == '(' || c == '[' || c == '{') {
        stk.push(c);
      } else {
        if (stk.empty())
          return false;
        char top = stk.top();
        if ((c == ')' && top != '(') || (c == ']' && top != '[') ||
            (c == '}' && top != '{')) {
          return false;
        }
        stk.pop();
      }
    }
    return stk.empty();
  }
};
