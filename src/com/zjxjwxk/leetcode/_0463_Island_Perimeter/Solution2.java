package com.zjxjwxk.leetcode._0463_Island_Perimeter;

/**
 * 迭代
 * @author Xinkang Wu
 * @date 2020/10/30 12:21 下午
 */
public class Solution2 {

    public int islandPerimeter(int[][] grid) {
        int row = grid.length, col = grid[0].length, land = 0, border = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (grid[i][j] == 1) {
                    ++land;
                    if (i + 1 < row && grid[i + 1][j] == 1) {
                        ++border;
                    }
                    if (j + 1 < col && grid[i][j + 1] == 1) {
                        ++border;
                    }
                }
            }
        }
        return 4 * land - 2 * border;
    }
}
