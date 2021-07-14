package com.zjxjwxk.leetcode._0218_The_Skyline_Problem;

import java.util.*;

/**
 * 暴力
 * 时间复杂度O(n^2)
 * @author Xinkang Wu
 * @date 2021/7/14 10:59
 */
public class Solution {

    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> xSet = new TreeSet<>();
        for (int[] building : buildings) {
            xSet.add(building[0]);
            xSet.add(building[1]);
        }
        for (Integer x : xSet) {
            int y = findHighest(buildings, x);
            int size = ans.size();
            if (size == 0 || y != ans.get(size - 1).get(1)) {
                ans.add(Arrays.asList(x, y));
            }
        }
        return ans;
    }

    private int findHighest(int[][] buildings, int x) {
        int highest = 0;
        for (int[] building : buildings) {
            if (x >= building[0] && x < building[1]) {
                highest = Math.max(highest, building[2]);
            }
        }
        return highest;
    }
}
