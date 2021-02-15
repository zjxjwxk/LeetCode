package com.zjxjwxk.leetcode._0485_Max_Consecutive_Ones;

/**
 * 一次遍历
 * @author Xinkang Wu
 * @date 2021/2/15 13:22
 */
public class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                ++count;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        ans = Math.max(ans, count);
        return ans;
    }
}
