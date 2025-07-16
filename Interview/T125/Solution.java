package Interview.T125;


class Solution {
    public boolean isPalindrome(String s) {
        // 处理s
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }
        
        String x = filtered.toString();
        int i = 0;
        int j = x.length() - 1;

        while (i < j) {
            if (x.charAt(i) != x.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}