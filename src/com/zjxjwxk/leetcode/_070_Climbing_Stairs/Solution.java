package com.zjxjwxk.leetcode._070_Climbing_Stairs;

/**
 * 递归加动态规划
 * f(n) = f(n - 1) + f(n - 2)
 * @author zjxjwxk
 */
public class Solution {

    private int[] dp;

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else {
            dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;
            return recursive(n);
        }
    }

    private int recursive(int n) {
        if (dp[n] != 0) {
            return dp[n];
        } else {
            dp[n] = recursive(n - 1) + recursive(n - 2);
            return dp[n];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(44));
    }
}
