package com.zjxjwxk.leetcode._0264_Ugly_Number_II;

import java.util.*;

/**
 * 最小堆
 * 时间复杂度O(nlogn)
 * 空间复杂度O(n)
 * @author Xinkang Wu
 * @date 2021/4/11 18:57
 */
public class Solution {

    public int nthUglyNumber(int n) {
        Queue<Long> minHeap = new PriorityQueue<>();
        Set<Long> uglySet = new TreeSet<>();
        minHeap.offer(1L);
        uglySet.add(1L);
        int[] factors = {2, 3, 5};
        long num = 1;
        for (int i = 0; i < n; ++i) {
            num = minHeap.poll();
            for (int factor : factors) {
                long next = num * factor;
                if (uglySet.add(next)) {
                    minHeap.add(next);
                }
            }
        }
        return (int) num;
    }
}
