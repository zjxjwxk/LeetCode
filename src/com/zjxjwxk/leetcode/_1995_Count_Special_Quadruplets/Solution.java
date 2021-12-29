package com.zjxjwxk.leetcode._1995_Count_Special_Quadruplets;

/**
 * 直接枚举
 * @author Xinkang Wu
 * @date 2021/12/29 11:19
 */
public class Solution {

    public int countQuadruplets(int[] nums) {
        int len = nums.length, ans = 0;
        for (int a = 0; a < len - 3; ++a) {
            for (int b = a + 1; b < len - 2; ++b) {
                for (int c = b + 1; c < len - 1; ++c) {
                    for (int d = c + 1; d < len; ++d) {
                        if (nums[a] + nums[b] + nums[c] == nums[d]) {
                            ++ans;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
