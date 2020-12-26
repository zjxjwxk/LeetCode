package com.zjxjwxk.leetcode._0084_Largest_Rectangle_in_Histogram;

/**
 * 暴力
 * 枚举高，求最大宽
 * @author Xinkang Wu
 * @date 2020/12/26 14:39
 */
public class Solution {

    public int largestRectangleArea(int[] heights) {
        if (heights == null) {
            return 0;
        }
        int len = heights.length, ans = 0;
        for (int i = 0; i < len; ++i) {
            int height = heights[i], left = i, right = i;
            while (left - 1 >= 0 && height <= heights[left - 1]) {
                --left;
            }
            while (right + 1 < len && height <= heights[right + 1]) {
                ++right;
            }
            ans = Math.max(ans, height * (right - left + 1));
        }
        return ans;
    }
}
