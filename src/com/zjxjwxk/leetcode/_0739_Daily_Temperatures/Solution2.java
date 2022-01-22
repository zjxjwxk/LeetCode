package com.zjxjwxk.leetcode._0739_Daily_Temperatures;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 单调栈
 * @author Xinkang Wu
 * @date 2022/1/22 17:41
 */
public class Solution2 {

    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < len; ++i) {
            int temperature = temperatures[i], peekIndex;
            while (!stack.isEmpty() && temperature > temperatures[(peekIndex = stack.peek())]) {
                ans[peekIndex] = i - peekIndex;
                stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }
}
