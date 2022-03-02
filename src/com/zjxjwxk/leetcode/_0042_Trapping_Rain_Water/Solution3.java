package com.zjxjwxk.leetcode._0042_Trapping_Rain_Water;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 单调栈
 * @author Xinkang Wu
 * @date 2022/3/2 21:07
 */
public class Solution3 {

    public int trap(int[] height) {
        int len = height.length, ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < len; ++i) {
            while (!stack.isEmpty() && height[i] >= height[stack.peek()]) {
                int popIndex = stack.pop();
                if (!stack.isEmpty()) {
                    ans += (Math.min(height[i], height[stack.peek()]) - height[popIndex]) * (i - stack.peek() - 1);
                }
            }
            stack.push(i);
        }
        return ans;
    }
}
