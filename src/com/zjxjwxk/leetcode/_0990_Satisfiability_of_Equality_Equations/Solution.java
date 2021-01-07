package com.zjxjwxk.leetcode._0990_Satisfiability_of_Equality_Equations;

/**
 * 并查集
 * @author Xinkang Wu
 * @date 2021/1/7 09:05
 */
public class Solution {

    public boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];
        for (int i = 0; i < 26; ++i) {
            parent[i] = i;
        }
        for (String equation : equations) {
            if (equation.charAt(1) == '=') {
                union(parent, equation.charAt(0) - 'a', equation.charAt(3) - 'a');
            }
        }
        for (String equation : equations) {
            if (equation.charAt(1) == '!' &&
                    findParent(parent, equation.charAt(0) - 'a') == findParent(parent, equation.charAt(3) - 'a')) {
                return false;
            }
        }
        return true;
    }

    private void union(int[] parent, int i, int j) {
        int parent1 = findParent(parent, i);
        int parent2 = findParent(parent, j);
        if (parent1 != parent2) {
            parent[parent1] = parent2;
        }
    }

    private int findParent(int[] parent, int i) {
        while (parent[i] != i) {
            parent[i] = parent[parent[i]];
            i = parent[i];
        }
        return i;
    }
}
