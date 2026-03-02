package com.zjxjwxk.leetcode._0373_Find_K_Pairs_with_Smallest_Sums;

import java.util.*;

/**
 * 最小堆
 *
 * @author Xinkang Wu
 * @date 2026/3/2 20:47
 */
public class Solution {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int len1 = nums1.length, len2 = nums2.length;
        List<List<Integer>> ans = new ArrayList<>();
        Queue<int[]> minHeap = new PriorityQueue<>(k, Comparator.comparingInt(pair -> nums1[pair[0]] + nums2[pair[1]]));
        for (int i = 0; i < Math.min(k, len1); ++i) {
            minHeap.offer(new int[]{i, 0});
        }
        for (int i = 0; i < k && !minHeap.isEmpty(); ++i) {
            int[] pair = minHeap.poll();
            ans.add(Arrays.asList(nums1[pair[0]], nums2[pair[1]]));
            if (pair[1] < len2 - 1) {
                ++pair[1];
                minHeap.offer(pair);
            }
        }
        return ans;
    }
}
