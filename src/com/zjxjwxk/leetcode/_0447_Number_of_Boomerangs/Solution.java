package com.zjxjwxk.leetcode._0447_Number_of_Boomerangs;

import java.util.HashMap;
import java.util.Map;

/**
 * 枚举 + 哈希表
 * @author Xinkang Wu
 * @date 2021/9/13 11:01
 */
public class Solution {

    public int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        for (int[] p1 : points) {
            Map<Integer, Integer> countMap = new HashMap<>();
            for (int[] p2 : points) {
                int distance = getDistance(p1, p2);
                countMap.merge(distance, 1, Integer::sum);
            }
            for (Integer count : countMap.values()) {
                ans += count * (count - 1);
            }
        }
        return ans;
    }

    private int getDistance(int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }
}
