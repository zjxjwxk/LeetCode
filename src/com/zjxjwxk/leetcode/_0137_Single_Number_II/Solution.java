package com.zjxjwxk.leetcode._0137_Single_Number_II;

/**
 * 位运算
 * @author Xinkang Wu
 * @date 2021/4/30 23:38
 */
public class Solution {

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; ++i) {
            int digitSum = 0;
            for (int num : nums) {
                digitSum += (num >> i) & 1;
            }
            if (digitSum % 3 != 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }
}
