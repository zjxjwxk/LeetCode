package com.zjxjwxk.leetcode._0268_Missing_Number;

/**
 * 位运算
 * @author Xinkang Wu
 * @date 2021/11/6 11:37
 */
public class Solution {

    public int missingNumber(int[] nums) {
        int n = nums.length, xor = 0;
        for (int i = 0; i <= n; ++i) {
            xor ^= i;
        }
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}
