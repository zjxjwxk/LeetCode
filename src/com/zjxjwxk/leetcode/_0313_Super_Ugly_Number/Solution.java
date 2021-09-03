package com.zjxjwxk.leetcode._0313_Super_Ugly_Number;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * 最小堆
 * 时间复杂度：O(nmlognm)
 * @author Xinkang Wu
 * @date 2021/9/2 18:26
 */
public class Solution {

    public int nthSuperUglyNumber(int n, int[] primes) {
        int ans = 1;
        Queue<Long> minHeap = new PriorityQueue<>();
        Set<Long> numSet = new HashSet<>();
        minHeap.offer(1L);
        numSet.add(1L);
        for (int i = 0; i < n; ++i) {
            long minNum = minHeap.poll();
            ans = (int) minNum;
            for (int prime : primes) {
                long next = minNum * prime;
                if (numSet.add(next)) {
                    minHeap.offer(next);
                }
            }
        }
        return ans;
    }
}
