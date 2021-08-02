package com.zjxjwxk.leetcode._1893_Check_if_All_the_Integers_in_a_Range_Are_Covered;

/**
 * 差分数组
 *
 * @author Xinkang Wu
 * @date 2021/7/27 23:20
 */
public class Solution {

    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff = new int[52];
        for (int[] range : ranges) {
            ++diff[range[0]];
            --diff[range[1] + 1];
        }
        int preSum = 0;
        for (int i = 1; i <= right; ++i) {
            preSum += diff[i];
            if (i >= left && i <= right && preSum == 0) {
                return false;
            }
        }
        return true;
    }
}
