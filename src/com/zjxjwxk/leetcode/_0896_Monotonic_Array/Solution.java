package com.zjxjwxk.leetcode._0896_Monotonic_Array;

/**
 * 一次遍历
 * @author Xinkang Wu
 * @date 2021/2/28 13:37
 */
public class Solution {

    public boolean isMonotonic(int[] A) {
        boolean increase = true, decrease = true;
        for (int i = 0; i < A.length - 1; ++i) {
            if (A[i] > A[i + 1]) {
                increase = false;
            } else if (A[i] < A[i + 1]) {
                decrease = false;
            }
        }
        return increase || decrease;
    }
}
