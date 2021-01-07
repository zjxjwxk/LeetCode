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
        int equationsLen = equations.size(), queriesLen = queries.size(), index = 0;
        Map<String, Integer> indexMap = new HashMap<>(equationsLen << 1);
        int[] parent = new int[equationsLen << 1];
        double[] weight = new double[equationsLen << 1];
        for (int i = 0; i < equationsLen; ++i) {
            List<String> equation = equations.get(i);
            String str1 = equation.get(0);
            String str2 = equation.get(1);
            Integer index1 = indexMap.get(str1);
            Integer index2 = indexMap.get(str2);
            if (index1 == null) {
                index1 = index++;
                indexMap.put(str1, index1);
            }
            if (index2 == null) {
                index2 = index++;
                indexMap.put(str2, index2);
            }
            weight[index1] = values[i];
        }
        for (int i = 0; i < index; ++i) {
            parent[i] = i;
            if (weight[i] == 0) {
                weight[i] = 1;
            }
        }
        for (int i = 0; i < equationsLen; ++i) {
            List<String> equation = equations.get(i);
            int index1 = indexMap.get(equation.get(0));
            int index2 = indexMap.get(equation.get(1));
            union(parent, weight, index1, index2, values[i]);
        }
        double[] ans = new double[queriesLen];
        for (int i = 0; i < queriesLen; ++i) {
            List<String> query = queries.get(i);
            Integer index1 = indexMap.get(query.get(0));
            Integer index2 = indexMap.get(query.get(1));
            if (index1 == null || index2 == null) {
                ans[i] = -1;
            } else {
                int parent1 = (int) findParent(parent, weight, index1)[0];
                int parent2 = (int) findParent(parent, weight, index2)[0];
                if (parent1 != parent2) {
                    ans[i] = -1;
                } else {
                    ans[i] = weight[index1] / weight[index2];
                }
            }
        }
        return ans;
    }

    private void union(int[] parent, double[] weight, int index1, int index2, double value) {
        double[] ret1 = findParent(parent, weight, index1);
        double[] ret2 = findParent(parent, weight, index2);
        if (ret1[0] != ret2[0]) {
            parent[(int) ret1[0]] = (int) ret2[0];
            weight[(int) ret1[0]] = value / ret1[1] * ret2[1];
        }
    }

    private double[] findParent(int[] parent, double[] weight, int index) {
        double[] ret = new double[2];
        int root = index;
        double weightSum = 1;
        while (root != parent[root]) {
            weightSum *= weight[root];
            root = parent[root];
        }
        ret[1] = weightSum;
        while (index != parent[index]) {
            double w = weight[index];
            weight[index] = weightSum;
            weightSum /= w;
            int tempParent = parent[index];
            parent[index] = root;
            index = tempParent;
        }
        ret[0] = index;
        return ret;
    }
}
