package com.zjxjwxk.leetcode._3151_Special_Array_I;

/**
 * @author Xinkang Wu
 * @date 2024/8/13 23:11
 */
public class Solution {

    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; ++i) {
            if (((nums[i - 1] ^ nums[i]) & 1) == 0) {
                return false;
            }
        }
        return true;
    }
}
