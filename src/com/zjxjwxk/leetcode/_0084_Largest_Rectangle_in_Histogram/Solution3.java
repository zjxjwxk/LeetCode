package com.zjxjwxk.leetcode._0084_Largest_Rectangle_in_Histogram;

import java.util.Stack;

/**
 * 单调栈+常数优化
 * @author Xinkang Wu
 * @date 2020/12/26 18:26
 */
public class Solution3 {

    public int largestRectangleArea(int[] heights) {
        if (heights == null) {
            return 0;
        }
        int len = heights.length, ans = 0;
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[len];
        for (int i = 0; i < len; ++i) {
            while (!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
                int popIndex = stack.pop();
                ans = Math.max(ans, (i - left[popIndex] - 1) * heights[popIndex]);
            }
            if (stack.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = stack.peek();
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int popIndex = stack.pop();
            ans = Math.max(ans, (len - left[popIndex] - 1) * heights[popIndex]);
        }
        return ans;
    }
}
