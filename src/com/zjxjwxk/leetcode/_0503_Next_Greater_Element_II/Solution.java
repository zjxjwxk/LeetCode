package com.zjxjwxk.leetcode._0503_Next_Greater_Element_II;

import java.util.Arrays;

/**
 * 单调栈
 * @author Xinkang Wu
 * @date 2021/3/6 15:20
 */
public class Solution {

    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length, index = -1;
        int[] stack = new int[len * 2], ans = new int[len];
        Arrays.fill(ans, -1);
        for (int i = 0; i < len * 2 - 1; ++i) {
            while (index >= 0 && nums[i % len] > nums[stack[index]]) {
                ans[stack[index--]] = nums[i % len];
            }
            stack[++index] = i % len;
        }
        return ans;
    }
}
