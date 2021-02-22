package com.zjxjwxk.leetcode._1438_Longest_Continuous_Subarray_With_Absolute_Diff_Less_Than_or_Equal_to_Limit;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 滑动窗口+单调队列
 * 时间：O(n)，空间：O(n)
 * @author Xinkang Wu
 * @date 2021/2/21 22:55
 */
public class Solution2 {

    public int longestSubarray(int[] nums, int limit) {
        int len = nums.length, i = 0, j = 0, ans = 0;
        Deque<Integer> maxQueue = new LinkedList<>();
        Deque<Integer> minQueue = new LinkedList<>();
        while (j < len) {
            while (!maxQueue.isEmpty() && nums[j] > maxQueue.peekLast()) {
                maxQueue.pollLast();
            }
            while (!minQueue.isEmpty() && nums[j] < minQueue.peekLast()) {
                minQueue.pollLast();
            }
            maxQueue.offerLast(nums[j]);
            minQueue.offerLast(nums[j]);
            while (!maxQueue.isEmpty() && !minQueue.isEmpty() && maxQueue.peekFirst() - minQueue.peekFirst() > limit) {
                if (maxQueue.peekFirst() == nums[i]) {
                    maxQueue.pollFirst();
                }
                if (minQueue.peekFirst() == nums[i]) {
                    minQueue.pollFirst();
                }
                ++i;
            }
            ans = Math.max(ans, j - i + 1);
            ++j;
        }
        return ans;
    }
}
