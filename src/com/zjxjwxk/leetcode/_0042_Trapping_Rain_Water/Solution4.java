package com.zjxjwxk.leetcode._0042_Trapping_Rain_Water;

/**
 * 单调栈（数组版）
 *
 * @author Xinkang Wu
 * @date 2025/5/26 23:32
 */
public class Solution4 {

    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int n = height.length, top = -1, ans = 0;
        int[] stack = new int[n];
        for (int right = 0; right < n; ++right) {
            while (top >= 0 && height[right] >= height[stack[top]]) {
                int mid = stack[top--];
                if (top < 0) {
                    break;
                }
                int left = stack[top];
                ans += (right - left - 1) * (Math.min(height[left], height[right]) - height[mid]);
            }
            stack[++top] = right;
        }
        return ans;
    }
}
