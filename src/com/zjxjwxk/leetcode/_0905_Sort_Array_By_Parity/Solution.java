package com.zjxjwxk.leetcode._0905_Sort_Array_By_Parity;

/**
 * 双指针
 * @author Xinkang Wu
 * @date 2020/11/12 11:00 上午
 */
public class Solution {

    public int[] sortArrayByParity(int[] A) {
        for (int i = 0, j = A.length - 1; i <= j; ++i) {
            if ((A[i] & 1) == 1) {
                while (i <= j && (A[j] & 1) == 1) {
                    --j;
                }
                if (i < j) {
                    swap(A, i, j);
                }
            }
        }
        return A;
    }

    private void swap(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
}
