package com.zjxjwxk.leetcode._0051_N_Queens;

import java.util.*;

/**
 * 基于集合的回溯剪枝
 * @author Xinkang Wu
 * @date 2020/10/17 11:46 上午
 */
public class Solution {

    private final List<List<String>> ans = new ArrayList<>();
    private final Set<Integer> columns = new HashSet<>();
    private final Set<Integer> diagonals1 = new HashSet<>();
    private final Set<Integer> diagonals2 = new HashSet<>();
    private int[] queens;
    private int n;

    public List<List<String>> solveNQueens(int n) {
        queens = new int[n];
        this.n = n;
        dfs(0);
        return ans;
    }

    private void dfs(int row) {
        if (row == n) {
            ans.add(getSolution());
            return;
        }
        for (int col = 0; col < n; ++col) {
            int diagonal1 = row - col, diagonal2 = row + col;
            if (!columns.contains(col) && !diagonals1.contains(diagonal1) && !diagonals2.contains(diagonal2)) {
                queens[row] = col;
                columns.add(col);
                diagonals1.add(diagonal1);
                diagonals2.add(diagonal2);
                dfs(row + 1);
                columns.remove(col);
                diagonals1.remove(diagonal1);
                diagonals2.remove(diagonal2);
            }
        }
    }

    private List<String> getSolution() {
        List<String> solution = new ArrayList<>();
        for (int row = 0; row < n; ++row) {
            char[] str = new char[n];
            Arrays.fill(str, '.');
            str[queens[row]] = 'Q';
            solution.add(new String(str));
        }
        return solution;
    }
}
