package com.zjxjwxk.leetcode._0042_Trapping_Rain_Water;

/**
 * 双指针
 * 时间复杂度O(n)
 * 空间复杂度O(1)
 * @author Xinkang Wu
 * @date 2021/4/6 23:05
 */
public class Solution2 {

    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int len = height.length, leftMax = height[0], rightMax = height[len - 1], left = 0, right = len - 1, ans = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                ans += leftMax - height[left];
                ++left;
                leftMax = Math.max(leftMax, height[left]);
            } else {
                ans += rightMax - height[right];
                --right;
                rightMax = Math.max(rightMax, height[right]);
            }
        }
        return ans;
    }
}
