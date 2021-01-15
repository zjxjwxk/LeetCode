package com.zjxjwxk.leetcode._0947_Most_Stones_Removed_with_Same_Row_or_Column;

import java.util.HashSet;
import java.util.Set;

/**
 * 并查集
 * 合并石头序号
 * 时间复杂度 O(n^2 * log(len))
 * @author Xinkang Wu
 * @date 2021/1/15 10:43
 */
public class Solution {

    public int removeStones(int[][] stones) {
        int len = stones.length;
        int[] parent = new int[len];
        for (int i = 0; i < len; ++i) {
            parent[i] = i;
        }
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    union(parent, i, j);
                }
            }
        }
        Set<Integer> rootSet = new HashSet<>();
        for (int i = 0; i < len; ++i) {
            rootSet.add(find(parent, i));
        }
        return len - rootSet.size();
    }

    private void union(int[] parent, int i, int j) {
        int parent1 = find(parent, i);
        int parent2 = find(parent, j);
        if (parent1 != parent2) {
            parent[parent1] = parent2;
        }
    }

    private int find(int[] parent, int i) {
        int root = i;
        while (root != parent[root]) {
            root = parent[root];
        }
        while (i != parent[i]) {
            int tempParent = parent[i];
            parent[i] = root;
            i = tempParent;
        }
        return i;
    }
}
