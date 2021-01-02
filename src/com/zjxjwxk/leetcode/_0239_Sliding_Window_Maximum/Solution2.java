package com.zjxjwxk.leetcode._0239_Sliding_Window_Maximum;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 单调双端队列
 * @author Xinkang Wu
 * @date 2021/1/2 15:46
 */
public class Solution2 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] ans = new int[len - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.getLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        ans[0] = nums[deque.getFirst()];
        for (int i = k; i < len; ++i) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.getLast()]) {
                deque.pollLast();
            }
            while (!deque.isEmpty() && deque.getFirst() < i - k + 1) {
                deque.pollFirst();
            }
            deque.offerLast(i);
            ans[i - k + 1] = nums[deque.getFirst()];
        }
        return ans;
    }
}
