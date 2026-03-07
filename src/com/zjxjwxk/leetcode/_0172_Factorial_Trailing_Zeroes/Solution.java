package com.zjxjwxk.leetcode._0172_Factorial_Trailing_Zeroes;

/**
 * 数学
 * 时间复杂度：O(logn)
 * ∑[n/(5^k)], k属于[1, +∞)
 *
 * @author Xinkang Wu
 * @date 2026/3/7 13:54
 */
public class Solution {

    public int trailingZeroes(int n) {
        int ans = 0;
        while (n != 0) {
            n /= 5;
            ans += n;
        }
        return ans;
    }
}
