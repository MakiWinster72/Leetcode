class Solution {
public:
  void gameOfLife(vector<vector<int>> &board) {
    int m = board.size(), n = board[0].size();

    // 定义方向数组，表示八个相邻位置
    vector<pair<int, int>> dirs = {
        {0, 1}, {1, 0},   {0, -1}, {-1, 0}, // 上下左右
        {1, 1}, {-1, -1}, {1, -1}, {-1, 1}  // 四个对角线
    };

    // 第一步：在每个格子的第2位（bit1）编码下一轮的状态
    for (int i = 0; i < m; ++i) {
      for (int j = 0; j < n; ++j) {
        int live = 0;

        // 统计八个邻居中当前为活细胞（bit0为1）的个数
        for (auto &[dx, dy] : dirs) {
          int ni = i + dx, nj = j + dy;
          if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
            live += board[ni][nj] & 1; // 只取最低位（当前状态）
          }
        }

        // 当前是活细胞
        if ((board[i][j] & 1) == 1) {
          if (live == 2 || live == 3) {
            board[i][j] |= 2; // 将下一状态设置为1（保持活）
          }
          // 否则不变（下一状态仍为0，默认死）
        } else {
          // 当前是死细胞，若邻居恰好有3个活细胞，则变为活
          if (live == 3) {
            board[i][j] |= 2; // 下一状态设置为1（变活）
          }
        }
      }
    }

    // 第二步：统一将所有格子的状态更新为下一轮的状态
    // 即将bit1（下一状态）右移到bit0，完成更新
    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j)
        board[i][j] >>= 1;
  }
};
