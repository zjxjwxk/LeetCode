package com.zjxjwxk.leetcode._0740_Delete_and_Earn;

/**
 * 动态规划
 *
 * @author Xinkang Wu
 * @date 2021/5/5 22:59
 */
public class Solution {

    public int deleteAndEarn(int[] nums) {
        int maxNum = Integer.MIN_VALUE, minNum = Integer.MAX_VALUE;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum, num);
        }
        int[] earns = new int[maxNum + 1];
        for (int num : nums) {
            earns[num] += num;
        }
        int first = 0, second = earns[minNum];
        for (int i = minNum + 1; i <= maxNum; ++i) {
            int third = Math.max(first + earns[i], second);
            first = second;
            second = third;
        }
        return second;
    }
}
