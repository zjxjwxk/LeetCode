package com.zjxjwxk.leetcode._0997_Find_the_Town_Judge;

/**
 * @author Xinkang Wu
 * @date 2021/12/19 13:06
 */
public class Solution {

    public int findJudge(int n, int[][] trust) {
        int[] counts = new int[n + 1];
        boolean[] trustOther = new boolean[n + 1];
        for (int[] t : trust) {
            ++counts[t[1]];
            trustOther[t[0]] = true;
        }
        for (int i = 1; i <= n; ++i) {
            if (counts[i] == n - 1 && !trustOther[i]) {
                return i;
            }
        }
        return -1;
    }
}
