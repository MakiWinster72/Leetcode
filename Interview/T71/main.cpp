#include <sstream>
#include <string>
#include <vector>
using namespace std;

class Solution {
public:
  string simplifyPath(string path) {
    vector<string> stk;
    stringstream ss(path);
    string token;

    while (getline(ss, token, '/')) {
      if (token == "" || token == ".")
        continue;
      if (token == "..") {
        if (!stk.empty())
          stk.pop_back();
      } else {
        stk.push_back(token); // ⬅️ 你漏了这一句
      }
    }

    string res = "/";
    for (int i = 0; i < stk.size(); ++i) {
      res += stk[i];
      if (i != stk.size() - 1)
        res += "/";
    }

    return res;
  }
};
