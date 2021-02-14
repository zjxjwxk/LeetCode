package com.zjxjwxk.leetcode._0765_Couples_Holding_Hands;

/**
 * 并查集
 * @author Xinkang Wu
 * @date 2021/2/14 13:17
 */
public class Solution {

    public int minSwapsCouples(int[] row) {
        int len = row.length, pairNum = len / 2, count = pairNum;
        int[] parent = new int[pairNum];
        for (int i = 0; i < pairNum; ++i) {
            parent[i] = i;
        }
        for (int i = 0; i < len; i += 2) {
            if (union(parent, row[i] / 2, row[i + 1] / 2)) {
                --count;
            }
        }
        return pairNum - count;
    }

    private boolean union(int[] parent, int i, int j) {
        int parent1 = find(parent, i);
        int parent2 = find(parent, j);
        if (parent1 != parent2) {
            parent[parent1] = parent2;
            return true;
        }
        return false;
    }

    private int find(int[] parent, int index) {
        int root = index;
        while (root != parent[root]) {
            root = parent[root];
        }
        while (index != parent[index]) {
            int tempParent = parent[index];
            parent[index] = root;
            index = tempParent;
        }
        return root;
    }
}
