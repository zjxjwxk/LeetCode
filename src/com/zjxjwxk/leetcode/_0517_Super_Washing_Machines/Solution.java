package com.zjxjwxk.leetcode._0517_Super_Washing_Machines;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2021/9/29 14:35
 */
public class Solution {

    public int findMinMoves(int[] machines) {
        int len = machines.length, sum = 0;
        for (int num : machines) {
            sum += num;
        }
        if (sum % len != 0) {
            return -1;
        }
        int avg = sum / len, ans = 0, preSum = 0;
        for (int num : machines) {
            num -= avg;
            preSum += num;
            ans = Math.max(ans, Math.max(Math.abs(preSum), num));
        }
        return ans;
    }
}
