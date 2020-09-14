package com.zjxjwxk.leetcode._0010_Regular_Expression_Matching;

/**
 * @author Xinkang Wu
 * @date 2020/9/12 3:30 下午
 */
public class Solution2 {

    public boolean isMatch(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        boolean[][] dp = new boolean[sLen + 1][pLen + 1];

        for (int i = 0; i <= sLen; ++i) {
            for (int j = 0; j <= pLen; ++j) {
                // 模式串为空
                if (j == 0) {
                    // 仅当字符串也为空时匹配成功
                    dp[i][j] = i == 0;
                } else {
                    // 模式串不为空
                    // 不为*
                    if (p.charAt(j - 1) != '*') {
                        if (i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
                            dp[i][j] = dp[i - 1][j - 1];
                        }
                    } else {
                        // *表示0次
                        if (j >= 2) {
                            dp[i][j] |= dp[i][j - 2];
                        }
                        // *表示一次或多次
                        if (i >= 1 && j >= 2 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')) {
                            dp[i][j] |= dp[i - 1][j];
                        }
                    }
                }
            }
        }
        return dp[sLen][pLen];
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.isMatch("aa", "a"));
        System.out.println(solution2.isMatch("aa", "a*"));
        System.out.println(solution2.isMatch("ab", ".*"));
        System.out.println(solution2.isMatch("aab", "c*a*b"));
        System.out.println(solution2.isMatch("mississippi", "mis*is*p*."));
        System.out.println(solution2.isMatch("mississippi", "mis*is*ip*."));
        System.out.println(solution2.isMatch("a", "aa"));
        System.out.println(solution2.isMatch("a", "ab*"));
        System.out.println(solution2.isMatch("a", ".*..a*"));
    }
}
