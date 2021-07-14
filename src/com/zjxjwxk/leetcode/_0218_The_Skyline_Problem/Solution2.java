package com.zjxjwxk.leetcode._0218_The_Skyline_Problem;

import java.util.*;

/**
 * 扫描线+优先队列
 * 时间复杂度O(nlogn)
 * @author Xinkang Wu
 * @date 2021/7/14 10:59
 */
public class Solution2 {

    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> xSet = new TreeSet<>();
        for (int[] building : buildings) {
            xSet.add(building[0]);
            xSet.add(building[1]);
        }
        Queue<int[]> maxHeap = new PriorityQueue<>((building1, building2) -> (building2[1] - building1[1]));
        int index = 0, len = buildings.length;
        for (Integer x : xSet) {
            while (index < len && buildings[index][0] <= x) {
                maxHeap.offer(new int[]{buildings[index][1], buildings[index][2]});
                ++index;
            }
            while (!maxHeap.isEmpty() && maxHeap.peek()[0] <= x) {
                maxHeap.poll();
            }
            int y = maxHeap.isEmpty() ? 0 : maxHeap.peek()[1];
            if (ans.size() == 0 || y != ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(x, y));
            }
        }
        return ans;
    }
}
