package com.zjxjwxk.leetcode._0233_Number_of_Digit_One;

/**
 * 枚举每一数位上 1 的个数
 * @author Xinkang Wu
 * @date 2021/9/7 16:16
 */
public class Solution {

    public int countDigitOne(int n) {
        int digit = 1;
        int ans = 0;
        while (digit <= n) {
            ans += (n / (digit * 10)) * digit + Math.min(Math.max(n % (digit * 10) - digit + 1, 0), digit);
            digit *= 10;
        }
        return ans;
    }
}
