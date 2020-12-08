package com.zjxjwxk.leetcode._0861_Score_After_Flipping_Matrix;

/**翻转后计算
 * @author Xinkang Wu
 * @date 2020/12/8 22:35
 */
public class Solution {

    public int matrixScore(int[][] A) {
        int row = A.length, col = A[0].length;
        for (int i = 0; i < row; ++i) {
            if (A[i][0] == 0) {
                reverseRow(A, i);
            }
        }
        for (int i = 1; i < col; ++i) {
            int zeroCount = 0;
            for (int[] rowArr : A) {
                if (rowArr[i] == 0) {
                    ++zeroCount;
                }
            }
            if (zeroCount > (row >> 1)) {
                reverseCol(A, i);
            }
        }
        return getSum(A);
    }

    private void reverseRow(int[][] A, int row) {
        for (int i = 0; i < A[row].length; ++i) {
            A[row][i] ^= 1;
        }
    }

    private void reverseCol(int[][] A, int col) {
        for (int i = 0; i < A.length; ++i) {
            A[i][col] ^= 1;
        }
    }

    private int getSum(int[][] A) {
        int sum = 0;
        for (int[] binary : A) {
            sum += convert(binary);
        }
        return sum;
    }

    private int convert(int[] binary) {
        int num = 0, exp = 1;
        for (int i = binary.length - 1; i >= 0; --i) {
            num += binary[i] * exp;
            exp <<= 1;
        }
        return num;
    }
}
