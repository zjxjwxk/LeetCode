package com.zjxjwxk.leetcode._1319_Number_of_Operations_to_Make_Network_Connected;

/**
 * 并查集
 * @author Xinkang Wu
 * @date 2021/1/23 11:13
 */
public class Solution {

    public int makeConnected(int n, int[][] connections) {
        int len = connections.length, count = 0;
        if (len < n - 1) {
            return -1;
        }
        int[] parent = new int[n];
        for (int i = 0; i < n; ++i) {
            parent[i] = i;
        }
        for (int[] connection : connections) {
            if (union(parent, connection[0], connection[1])) {
                ++count;
            }
        }
        return n - count - 1;
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
