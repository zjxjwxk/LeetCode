package com.zjxjwxk.leetcode._0922_Sort_Array_By_Parity_II;

/**
 * 双指针
 * @author Xinkang Wu
 * @date 2020/11/12 10:33 上午
 */
public class Solution {

    public int[] sortArrayByParityII(int[] A) {
        for (int i = 0, j = 1; i < A.length; i += 2) {
            if ((A[i] & 1) == 1) {
                while ((A[j] & 1) == 1) {
                    j += 2;
                }
                swap(A, i, j);
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
