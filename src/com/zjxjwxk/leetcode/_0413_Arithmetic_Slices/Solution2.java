package com.zjxjwxk.leetcode._0413_Arithmetic_Slices;

/**
 * 计数
 * @author Xinkang Wu
 * @date 2021/9/3 17:52
 */
public class Solution2 {

    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return 0;
        }
        int diff = nums[1] - nums[0], t = 0, ans = 0;
        for (int i = 2; i < len; ++i) {
            if (nums[i] - nums[i - 1] == diff) {
                ++t;
            } else {
                t = 0;
                diff = nums[i] - nums[i - 1];
            }
            ans += t;
        }
        return ans;
    }
}
