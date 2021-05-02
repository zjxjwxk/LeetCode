package com.zjxjwxk.leetcode._0554_Brick_Wall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/5/2 20:53
 */
public class Solution {

    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (List<Integer> bricks : wall) {
            int offset = 0;
            for (int i = 0; i < bricks.size() - 1; ++i) {
                offset += bricks.get(i);
                countMap.merge(offset, 1, Integer::sum);
            }
        }
        int max = 0;
        for (Integer count : countMap.values()) {
            max = Math.max(max, count);
        }
        return wall.size() - max;
    }
}
