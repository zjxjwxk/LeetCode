package com.zjxjwxk.leetcode._0413_Arithmetic_Slices;

/**
 * 求和公式
 * @author Xinkang Wu
 * @date 2021/9/3 17:52
 */
public class Solution {

    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return 0;
        }
        int i = 0, j = 2, diff = nums[1] - nums[0], ans = 0;
        while (j < len) {
            if (nums[j] - nums[j - 1] != diff) {
                ans += getNumber(i, j);
                i = j - 1;
                diff = nums[j] - nums[i];
            }
            ++j;
        }
        ans += getNumber(i, j);
        return ans;
    }

    private int getNumber(int i, int j) {
        if (j - i >= 3) {
            int n = j - i - 2;
            return ((1 + n) * n) >> 1;
        } else {
            return 0;
        }
    }
}
