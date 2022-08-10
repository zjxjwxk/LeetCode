package com.zjxjwxk.leetcode._0011_Container_With_Most_Water;

/**
 * 双指针
 *
 * @author zjxjwxk
 * @date 2022/8/10 22:12
 */
public class Solution {

    public int maxArea(int[] height) {
        int ans = 0, len = height.length, left = 0, right = len - 1;
        while (left < right) {
            ans = Math.max(ans, Math.min(height[left], height[right]) * (right - left));
            if (height[left] <= height[right]) {
                ++left;
            } else {
                --right;
            }
        }
        return ans;
    }
}
