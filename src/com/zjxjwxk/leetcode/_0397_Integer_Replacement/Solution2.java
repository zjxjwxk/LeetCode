package com.zjxjwxk.leetcode._0397_Integer_Replacement;

/**
 * 贪心
 * 时间复杂度O(logn)
 * 空间复杂度O(1)
 * @author Xinkang Wu
 * @date 2021/11/19 13:31
 */
public class Solution2 {

    public int integerReplacement(int n) {
        int ans = 0;
        while (n != 1) {
            if ((n & 1) == 0) {
                n >>= 1;
                ++ans;
            } else {
                if (n == 3 || (n - 1) % 4 == 0) {
                    n = n >> 1;
                } else {
                    n = (n >> 1) + 1;
                }
                ans += 2;
            }
        }
        return ans;
    }
}
