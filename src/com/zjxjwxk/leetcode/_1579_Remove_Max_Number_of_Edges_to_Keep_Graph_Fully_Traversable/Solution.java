package com.zjxjwxk.leetcode._1579_Remove_Max_Number_of_Edges_to_Keep_Graph_Fully_Traversable;

/**
 * 并查集
 * @author Xinkang Wu
 * @date 2021/1/27 19:46
 */
public class Solution {

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        int ans = 0, num = n;
        int[] parent = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            parent[i] = i;
        }
        for (int[] edge : edges) {
            if (edge[0] == 3) {
                if (!union(parent, edge[1], edge[2])) {
                    ++ans;
                } else {
                    --num;
                }
            }
        }
        int[] copy = new int[n + 1];
        System.arraycopy(parent, 0, copy, 0, n + 1);
        int num1 = num, num2 = num;
        for (int[] edge : edges) {
            if (edge[0] == 1) {
                if (!union(parent, edge[1], edge[2])) {
                    ++ans;
                } else {
                    --num1;
                }
            } else if (edge[0] == 2) {
                if (!union(copy, edge[1], edge[2])) {
                    ++ans;
                } else {
                    --num2;
                }
            }
        }
        if (num1 != 1 || num2 != 1) {
            return -1;
        }
        return ans;
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
        return index;
    }
}
