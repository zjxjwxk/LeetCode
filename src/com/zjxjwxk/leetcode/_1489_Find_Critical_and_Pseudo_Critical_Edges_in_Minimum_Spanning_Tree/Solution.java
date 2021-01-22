package com.zjxjwxk.leetcode._1489_Find_Critical_and_Pseudo_Critical_Edges_in_Minimum_Spanning_Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 最小生成树（Kruskal）
 * @author Xinkang Wu
 * @date 2021/1/21 20:37
 */
public class Solution {

    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        int len = edges.length, sum = 0;
        int[] parent = new int[n];
        initParent(parent);
        int[][] copyEdges = new int[len][4];
        for (int i = 0; i < len; ++i) {
            System.arraycopy(edges[i], 0, copyEdges[i], 0, 3);
            copyEdges[i][3] = i;
        }
        Arrays.sort(copyEdges, Comparator.comparingInt(edge -> edge[2]));
        for (int i = 0; i < len; ++i) {
            if (union(parent, copyEdges[i][0], copyEdges[i][1])) {
                sum += copyEdges[i][2];
            }
        }
        List<List<Integer>> ans = new ArrayList<>(2);
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        for (int i = 0; i < len; ++i) {
            initParent(parent);
            int tempSum = 0, count = 0;
            for (int j = 0; j < len; ++j) {
                if (j != i && union(parent, copyEdges[j][0], copyEdges[j][1])) {
                    tempSum += copyEdges[j][2];
                    if (++count == n - 1) {
                        break;
                    }
                }
            }
            if (tempSum > sum || count != n - 1) {
                ans.get(0).add(copyEdges[i][3]);
            } else {
                initParent(parent);
                union(parent, copyEdges[i][0], copyEdges[i][1]);
                tempSum = copyEdges[i][2];
                count = 0;
                for (int j = 0; j < len; ++j) {
                    if (j != i && union(parent, copyEdges[j][0], copyEdges[j][1])) {
                        tempSum += copyEdges[j][2];
                        if (++count == n - 2) {
                            break;
                        }
                    }
                }
                if (tempSum == sum) {
                    ans.get(1).add(copyEdges[i][3]);
                }
            }
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

    private void initParent(int[] parent) {
        for (int i = 0; i < parent.length; ++i) {
            parent[i] = i;
        }
    }
}
