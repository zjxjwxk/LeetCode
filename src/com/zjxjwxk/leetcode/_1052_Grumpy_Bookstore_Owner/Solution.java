package com.zjxjwxk.leetcode._1052_Grumpy_Bookstore_Owner;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2021/2/23 12:26
 */
public class Solution {

    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int len = grumpy.length, sum = 0, ans;
        for (int i = 0; i < len; ++i) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }
        for (int i = 0; i < X && i < len; ++i) {
            if (grumpy[i] == 1) {
                sum += customers[i];
            }
        }
        ans = sum;
        for (int i = 1; i + X - 1 < len; ++i) {
            if (grumpy[i - 1] == 1) {
                sum -= customers[i - 1];
            }
            if (grumpy[i + X - 1] == 1) {
                sum += customers[i + X - 1];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
