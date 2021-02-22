package com.zjxjwxk.leetcode._1438_Longest_Continuous_Subarray_With_Absolute_Diff_Less_Than_or_Equal_to_Limit;

import java.util.TreeMap;

/**
 * 滑动窗口+有序集合
 * 时间：O(nlogn)，空间：O(n)
 * @author Xinkang Wu
 * @date 2021/2/21 22:55
 */
public class Solution {

    public int longestSubarray(int[] nums, int limit) {
        int len = nums.length, i = 0, j = 0, ans = 0;
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        while (j < len) {
            countMap.put(nums[j], countMap.getOrDefault(nums[j], 0) + 1);
            while (countMap.lastKey() - countMap.firstKey() > limit) {
                int preCount = countMap.put(nums[i], countMap.get(nums[i]) - 1);
                if (preCount == 1) {
                    countMap.remove(nums[i]);
                }
                ++i;
            }
            ans = Math.max(ans, j - i + 1);
            ++j;
        }
        return ans;
    }
}
