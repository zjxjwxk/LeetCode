package com.zjxjwxk.leetcode._1911_Maximum_Alternating_Subsequence_Sum;

/**
 * @author Xinkang Wu
 * @date 2022/8/6 13:09
 */
public class Solution {

    public long maxAlternatingSum(int[] nums) {
        int len = nums.length;
        long odd = 0, even = nums[0];
        for (int i = 1; i < len; ++i) {
            long nextOdd = Math.max(odd, even - nums[i]);
            long nextEven = Math.max(even, odd + nums[i]);
            odd = nextOdd;
            even = nextEven;
        }
        return even;
    }
}
