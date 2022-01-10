package com.zjxjwxk.leetcode._0060_Permutation_Sequence;

/**
 * 回溯
 * @author Xinkang Wu
 * @date 2022/1/9 17:12
 */
public class Solution {

    private int k;
    private String ans;

    public String getPermutation(int n, int k) {
        this.k = k;
        char[] chArr = new char[n];
        boolean[] vis = new boolean[n + 1];
        backtrack(chArr, n, 0, vis);
        return ans;
    }

    private boolean backtrack(char[] chArr, int n, int index, boolean[] vis) {
        if (index == n) {
            if (--k == 0) {
                ans = new String(chArr);
                return true;
            }
            return false;
        }
        for (int i = 1; i <= n; ++i) {
            if (!vis[i]) {
                vis[i] = true;
                chArr[index] = (char) ('0' + i);
                if (backtrack(chArr, n, index + 1, vis)) {
                    return true;
                }
                vis[i] = false;
            }
        }
        return false;
    }
}
