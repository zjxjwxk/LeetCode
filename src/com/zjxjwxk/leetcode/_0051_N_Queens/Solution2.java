package com.zjxjwxk.leetcode._0051_N_Queens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 基于位运算的回溯剪枝
 * @author Xinkang Wu
 * @date 2020/10/17 5:43 下午
 */
public class Solution2 {

    private final List<List<String>> ans = new ArrayList<>();
    private int[] queens;
    private int n;

    public List<List<String>> solveNQueens(int n) {
        queens = new int[n];
        this.n = n;
        dfs(0, 0, 0, 0);
        return ans;
    }

    private void dfs(int row, int columns, int diagonals1, int diagonals2) {
        if (row == n) {
            ans.add(getSolution());
            return;
        }
        // 获得所有可放置皇后的位置
        int availablePositions = ((1 << n) - 1) & (~(columns | diagonals1 | diagonals2));
        while (availablePositions != 0) {
            // 获得可放置皇后的位置中的最低位
            int position = availablePositions & (-availablePositions);
            // 将该最低位的值置成0
            availablePositions = availablePositions & (availablePositions - 1);
            // 获得该位置所对应的列下标
            int column = Integer.bitCount(position - 1);
            queens[row] = column;
            dfs(row + 1, columns | position, (diagonals1 | position) >> 1, (diagonals2 | position) << 1);
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
