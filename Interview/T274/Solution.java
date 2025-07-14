package Interview.T274;

import java.util.Arrays;

public class Solution {
  public int hIndex(int[] citations) {
    Arrays.sort(citations);
    int n = citations.length;
    int h = 0;

    for (int i = 0; i < n; i++) {
      int diff = n - i; // 剩余论文数
      if (citations[i] >= diff) {
        h = diff;
        break;
      }
    }
    return h;
  }
}

