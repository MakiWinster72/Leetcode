#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
  bool isValidSudoku(vector<vector<char>> &board) {
    bool row[9][9] = {false};
    bool col[9][9] = {false};
    bool box[9][9] = {false};

    for (int i = 0; i < 9; ++i) {
      for (int j = 0; j < 9; ++j) {
        char c = board[i][j];
        if (c == '.')
          continue;
        int num = c - '1';
        int boxIdx = (i / 3) * 3 + (j / 3);

        if (row[i][num] || col[j][num] || box[boxIdx][num])
          return false;

        row[i][num] = col[j][num] = box[boxIdx][num] = true;
      }
    }
    return true;
  }
};

void runTest(const vector<vector<char>> &board) {
  Solution sol;
  vector<vector<char>> b = board;
  cout << (sol.isValidSudoku(b) ? "✅ 合法" : "❌ 非法") << endl;
}

int main() {
  vector<vector<char>> board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

  runTest(board); // 应该输出 ✅ 合法
  return 0;
}
