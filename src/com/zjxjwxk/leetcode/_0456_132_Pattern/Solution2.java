package com.zjxjwxk.leetcode._0456_132_Pattern;

/**
 * 枚举2
 * 时间复杂度O(n)
 * @author Xinkang Wu
 * @date 2021/3/25 00:17
 */
public class Solution2 {

    public boolean find132pattern(int[] nums) {
        int len = nums.length, index = -1, kMax = Integer.MIN_VALUE;
        int[] stack = new int[len];
        stack[++index] = nums[len - 1];
        for (int j = len - 2; j >= 0; --j) {
            if (nums[j] < kMax) {
                return true;
            }
            while (index != -1 && nums[j] > stack[index]) {
                kMax = Math.max(kMax, stack[index--]);
            }
            if (nums[j] > kMax) {
                stack[++index] = nums[j];
            }
        }
        return false;
    }
}
