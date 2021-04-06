package com.zjxjwxk.leetcode._0042_Trapping_Rain_Water;

/**
 * 动态规划（预处理）
 * 时间复杂度O(n)
 * 空间复杂度O(n)
 * @author Xinkang Wu
 * @date 2021/4/5 20:01
 */
public class Solution {

    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int len = height.length, ans = 0;
        int[] leftMax = new int[len], rightMax = new int[len];
        leftMax[0] = height[0];
        for (int i = 1; i < len; ++i) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        rightMax[len - 1] = height[len - 1];
        for (int i = len - 2; i >= 0; --i) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        for (int i = 0; i < len; ++i) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }
}
