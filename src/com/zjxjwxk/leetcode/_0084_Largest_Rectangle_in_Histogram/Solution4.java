package com.zjxjwxk.leetcode._0084_Largest_Rectangle_in_Histogram;

/**
 * 单调栈+空间优化
 * @author Xinkang Wu
 * @date 2020/12/26 18:26
 */
public class Solution4 {

    public int largestRectangleArea(int[] heights) {
        int len = heights.length, top = -1, ans = 0;
        int[] stack = new int[len];
        for (int i = 0; i <= len; ++i) {
            int height = i < len ? heights[i] : 0;
            while (top >= 0 && height <= heights[stack[top]]) {
                int index = stack[top--];
                int left = top == -1 ? -1 : stack[top];
                int area = heights[index] * (i - left - 1);
                ans = Math.max(ans, area);
            }
            stack[++top] = i;
        }
        return ans;
    }
}
