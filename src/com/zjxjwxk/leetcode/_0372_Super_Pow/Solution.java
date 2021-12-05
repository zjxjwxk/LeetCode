package com.zjxjwxk.leetcode._0372_Super_Pow;

/**
 * 快速幂+倒序遍历
 * @author Xinkang Wu
 * @date 2021/12/5 16:31
 */
public class Solution {

    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        int len = b.length, ans = 1;
        a = a % MOD;
        for (int i = len - 1; i >= 0; --i) {
            ans = (ans * pow(a, b[i])) % MOD;
            a = pow(a, 10);
        }
        return ans;
    }

    private int pow(int a, int n) {
        int result = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            n >>= 1;
        }
        return result;
    }
}
