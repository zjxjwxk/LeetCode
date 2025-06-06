package com.zjxjwxk.leetcode._0041_First_Missing_Positive;

/**
 * 哈希表
 *
 * @author Xinkang Wu
 * @date 2025/6/6 23:29
 */
public class Solution2 {

    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] < 1) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            int num = Math.abs(nums[i]);
            if (num >= 1 && num <= n && nums[num - 1] > 0) {
                nums[num - 1] = -nums[num - 1];
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
