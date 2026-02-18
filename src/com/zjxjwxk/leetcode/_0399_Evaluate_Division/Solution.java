package com.zjxjwxk.leetcode._0399_Evaluate_Division;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 并查集+路径压缩
 * @author Xinkang Wu
 * @date 2021/1/6 18:21
 */
public class Solution {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int equationsSize = equations.size();
        UnionFind unionFind = new UnionFind(equationsSize << 1);
        Map<String, Integer> strIndexMap = new HashMap<>();
        int id = 0;
        for (int i = 0; i < equationsSize; i++) {
            List<String> equation = equations.get(i);
            String var1 = equation.get(0);
            String var2 = equation.get(1);
            if (!strIndexMap.containsKey(var1)) {
                strIndexMap.put(var1, id++);
            }
            if (!strIndexMap.containsKey(var2)) {
                strIndexMap.put(var2, id++);
            }
            unionFind.union(strIndexMap.get(var1), strIndexMap.get(var2), values[i]);
        }

        int queriesSize = queries.size();
        double[] ans = new double[queriesSize];
        for (int i = 0; i < queriesSize; i++) {
            List<String> query = queries.get(i);
            Integer id1 = strIndexMap.get(query.get(0));
            Integer id2 = strIndexMap.get(query.get(1));
            if (id1 == null || id2 == null) {
                ans[i] = -1d;
            } else {
                ans[i] = unionFind.calculate(id1, id2);
            }
        }
        return ans;
    }

    private class UnionFind {

        private int[] parent;
        private double[] weight;

        public UnionFind(int n) {
            this.parent = new int[n];
            this.weight = new double[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                weight[i] = 1d;
            }
        }

        public void union(int x, int y, double value) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            parent[rootX] = rootY;
            weight[rootX] = value * weight[y] / weight[x];
        }

        public int find(int x) {
            int cur = x;
            while (parent[cur] != cur) {
                cur = parent[cur];
                weight[x] *= weight[cur];
            }
            parent[x] = cur;
            return cur;
        }

        public double calculate(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                return -1d;
            }
            return weight[x] / weight[y];
        }
    }
}
