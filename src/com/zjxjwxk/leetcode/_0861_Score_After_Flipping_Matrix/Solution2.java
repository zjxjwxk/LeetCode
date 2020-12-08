package com.zjxjwxk.leetcode._0861_Score_After_Flipping_Matrix;

/**
 * 直接计算
 * @author Xinkang Wu
 * @date 2020/12/8 23:14
 */
public class Solution2 {

    public int matrixScore(int[][] A) {
        int row = A.length, col = A[0].length, exp = 1 << (col - 1);
        int ans = row * exp;
        for (int j = 1; j < col; ++j) {
            int oneCount = 0;
            exp >>= 1;
            for (int i = 0; i < row; ++i) {
                if (A[i][0] == 1) {
                    oneCount += A[i][j];
                } else {
                    oneCount += (A[i][j] ^= 1);
                }
            }
            ans += Math.max(oneCount, row - oneCount) * exp;
        }
        return ans;
    }
}
