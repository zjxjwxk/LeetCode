package com.zjxjwxk.leetcode._0283_Move_Zeroes;

/**
 * @author Xinkang Wu
 * @date 2020/11/19 11:06
 */
public class Solution {

    public void moveZeroes(int[] nums) {
        int index = 0, len = nums.length;
        for (int i = 0; i < len; ++i) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < len; ++i) {
            nums[i] = 0;
        }
    }
}
