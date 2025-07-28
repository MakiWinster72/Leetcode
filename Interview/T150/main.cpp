#include <stack>
#include <string>
class Solution {
public:
  int evalRPN(vector<string> &tokens) {
    std::stack<int> stk;

    for (const std::string &token : tokens) {
      if (token == "+" || token == "-" || token == "*" || token == "/") {
        int b = stk.top();
        stk.pop();
        int a = stk.top();
        stk.pop();
        if (token == "+")
          stk.push(a + b);
        else if (token == "-")
          stk.push(a - b);
      }
    }
  }
};
