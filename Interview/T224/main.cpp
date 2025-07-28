#include <stack>
#include <string>
using namespace std;

class Solution {
public:
  int calculate(string s) {
    stack<int> stk;
    int res = 0;
    int sign = 1; // 当前符号
    int n = s.size();
    int i = 0;

    while (i < n) {
      char c = s[i];

      if (isdigit(c)) {
        int num = 0;
        while (i < n && isdigit(s[i])) {
          num = num * 10 + (s[i] - '0');
          i++;
        }
        res += sign * num;
        continue; // 避免 i++ 再跳过有效字符
      }

      if (c == '+')
        sign = 1;
      else if (c == '-')
        sign = -1;
      else if (c == '(') {
        stk.push(res);  // 保存当前结果
        stk.push(sign); // 保存当前符号
        res = 0;        // 开启新表达式
        sign = 1;
      } else if (c == ')') {
        int prevSign = stk.top();
        stk.pop();
        int prevRes = stk.top();
        stk.pop();
        res = prevRes + prevSign * res;
      }

      i++;
    }

    return res;
  }
};
