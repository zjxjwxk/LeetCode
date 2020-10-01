package com.zjxjwxk.leetcode.LCP_19_Autumn_Leaves_Collection;

/**
 * @author zjxjwxk
 * @date 2020/10/1 10:58 下午
 */
public class Solution {

    public int minimumOperations(String leaves) {
        int len = leaves.length();
        int[][] dp = new int[len][3];
        dp[0][0] = leaves.charAt(0) == 'r' ? 0 : 1;
        dp[0][1] = dp[0][2] = dp[1][2] = Integer.MAX_VALUE;
        for (int i = 1; i < len; ++i) {
            int isRed = leaves.charAt(i) == 'r' ? 1 : 0;
            int isYellow = leaves.charAt(i) == 'y' ? 1 : 0;
            dp[i][0] = dp[i - 1][0] + isYellow;
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + isRed;
            if (i > 1) {
                dp[i][2] = Math.min(dp[i - 1][1], dp[i - 1][2]) + isYellow;
            }
        }
        return dp[len - 1][2];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumOperations("rrryyyrryyyrr"));
        System.out.println(solution.minimumOperations("ryr"));
    }
}
