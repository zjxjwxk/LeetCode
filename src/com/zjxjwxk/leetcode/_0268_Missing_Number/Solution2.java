package com.zjxjwxk.leetcode._0268_Missing_Number;

/**
 * 数学
 * @author Xinkang Wu
 * @date 2021/11/6 11:37
 */
public class Solution2 {

    public int missingNumber(int[] nums) {
        int n = nums.length, total = (n * (n + 1)) >> 1, sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return total - sum;
    }
}
