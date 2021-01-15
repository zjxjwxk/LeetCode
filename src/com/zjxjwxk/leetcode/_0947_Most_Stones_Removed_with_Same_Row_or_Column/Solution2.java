package com.zjxjwxk.leetcode._0947_Most_Stones_Removed_with_Same_Row_or_Column;

import java.util.HashMap;
import java.util.Map;

/**
 * 并查集
 * 合并横纵坐标
 * 时间复杂度 O(nlog(A))，A为不同的横纵坐标数
 * @author Xinkang Wu
 * @date 2021/1/15 11:46
 */
public class Solution2 {

    private int count = 0;

    public int removeStones(int[][] stones) {
        Map<Integer, Integer> parentMap = new HashMap<>();
        for (int[] stone : stones) {
            union(parentMap, stone[0] + 10001, stone[1]);
        }
        return stones.length - this.count;
    }

    private void union(Map<Integer, Integer> parentMap, int i, int j) {
        int parent1 = find(parentMap, i);
        int parent2 = find(parentMap, j);
        if (parent1 != parent2) {
            parentMap.put(parent1, parent2);
            --this.count;
        }
    }

    private int find(Map<Integer, Integer> parentMap, int i) {
        if (!parentMap.containsKey(i)) {
            parentMap.put(i, i);
            ++this.count;
            return i;
        }
        int root = i;
        while (root != parentMap.get(root)) {
            root = parentMap.get(root);
        }
        while (i != parentMap.get(i)) {
            int tempParent = parentMap.get(i);
            parentMap.put(i, root);
            i = tempParent;
        }
        return i;
    }
}
