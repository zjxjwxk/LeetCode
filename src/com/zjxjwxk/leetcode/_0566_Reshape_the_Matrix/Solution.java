package com.zjxjwxk.leetcode._0566_Reshape_the_Matrix;

/**
 * 二维数组的一维表示
 * @author Xinkang Wu
 * @date 2021/2/17 21:51
 */
public class Solution {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length, col = nums[0].length;
        if (row * col != r * c) {
            return nums;
        }
        int[][] newNums = new int[r][c];
        for (int index = 0; index < r * c; ++index) {
            newNums[index / c][index % c] = nums[index / col][index % col];
        }
        return newNums;
    }
}
