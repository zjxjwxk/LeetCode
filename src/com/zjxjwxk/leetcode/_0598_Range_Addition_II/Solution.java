package com.zjxjwxk.leetcode._0598_Range_Addition_II;

/**
 * 维护所有操作的交集
 * @author Xinkang Wu
 * @date 2021/11/7 16:01
 */
public class Solution {

    public int maxCount(int m, int n, int[][] ops) {
        int minI = m, minJ = n;
        for (int[] op : ops) {
            minI = Math.min(minI, op[0]);
            minJ = Math.min(minJ, op[1]);
        }
        return minI * minJ;
    }
}
