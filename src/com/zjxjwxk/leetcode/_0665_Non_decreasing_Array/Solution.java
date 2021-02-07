package com.zjxjwxk.leetcode._0665_Non_decreasing_Array;

/**
 * @author Xinkang Wu
 * @date 2021/2/7 00:19
 */
public class Solution {

    public boolean checkPossibility(int[] nums) {
        int len = nums.length;
        boolean flag = false;
        for (int i = 0; i < len - 1; ++i) {
            if (nums[i] > nums[i + 1]) {
                if (!flag && (i == 0 || i == len - 2 || nums[i - 1] <= nums[i + 1] || nums[i] <= nums[i + 2])) {
                    flag = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
