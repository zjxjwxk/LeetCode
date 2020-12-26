package com.zjxjwxk.leetcode._0084_Largest_Rectangle_in_Histogram;

import java.util.Stack;

/**
 * 单调栈
 * @author Xinkang Wu
 * @date 2020/12/26 16:05
 */
public class Solution2 {

    public int largestRectangleArea(int[] heights) {
        if (heights == null) {
            return 0;
        }
        int len = heights.length, ans = 0;
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[len], right = new int[len];
        for (int i = 0; i < len; ++i) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = len - 1; i >= 0; --i) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                right[i] = len;
            } else {
                right[i] = stack.peek();
            }
            stack.push(i);
        }
        for (int i = 0; i < len; ++i) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;
    }
}
