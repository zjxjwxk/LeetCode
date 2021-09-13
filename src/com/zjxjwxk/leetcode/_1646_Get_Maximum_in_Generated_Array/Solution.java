package com.zjxjwxk.leetcode._1646_Get_Maximum_in_Generated_Array;

/**
 * 模拟
 * @author Xinkang Wu
 * @date 2021/9/13 20:43
 */
public class Solution {

    public int getMaximumGenerated(int n) {
        if (n <= 1) {
            return n;
        }
        int[] nums = new int[n + 1];
        int max = 1;
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i <= n; ++i) {
            if ((i & 1) == 0) {
                nums[i] = nums[i >> 1];
            } else {
                nums[i] = nums[i >> 1] + nums[(i >> 1) + 1];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
