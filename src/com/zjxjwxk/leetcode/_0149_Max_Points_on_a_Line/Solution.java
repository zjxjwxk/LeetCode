package com.zjxjwxk.leetcode._0149_Max_Points_on_a_Line;

import java.util.HashMap;
import java.util.Map;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/6/24 15:16
 */
public class Solution {

    public int maxPoints(int[][] points) {
        int len = points.length, ans = 1;
        for (int i = 0; i < len - ans; ++i) {
            Map<Double, Integer> kMap = new HashMap<>();
            Map<Integer, Integer> verticalMap = new HashMap<>();
            for (int j = i + 1; j < len; ++j) {
                if (points[i][0] == points[j][0]) {
                    Integer count = verticalMap.getOrDefault(points[i][0], 1);
                    verticalMap.put(points[i][0], count + 1);
                    ans = Math.max(ans, count + 1);
                } else {
                    double k = points[i][1] == points[j][1] ? 0 : (double) (points[j][1] - points[i][1]) / (points[j][0] - points[i][0]);
                    Integer count = kMap.getOrDefault(k, 1);
                    kMap.put(k, count + 1);
                    ans = Math.max(ans, count + 1);
                }
            }
            if (ans > (len >> 1)) {
                return ans;
            }
        }
        return ans;
    }
}
