package com.zjxjwxk.leetcode._0650_2_Keys_Keyboard;

/**
 * 分解质因数
 * @author Xinkang Wu
 * @date 2021/9/19 11:35
 */
public class Solution {

    public int minSteps(int n) {
        int ans = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; ++i) {
            while (n % i == 0) {
                ans += i;
                n /= i;
            }
        }
        if (n == 1) {
            return ans;
        }
        return ans + n;
    }
}
