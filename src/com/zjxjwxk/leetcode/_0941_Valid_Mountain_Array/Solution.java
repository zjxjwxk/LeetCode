package com.zjxjwxk.leetcode._0941_Valid_Mountain_Array;

/**
 * @author Xinkang Wu
 * @date 2020/11/3 10:19 上午
 */
public class Solution {

    public boolean validMountainArray(int[] A) {
        int i = 0, len = A.length;
        while (i + 1 < len && A[i] < A[i + 1]) {
            ++i;
        }
        if (i == 0 || i == len - 1) {
            return false;
        }
        while (i + 1 < len && A[i] > A[i + 1]) {
            ++i;
        }
        return i == len - 1;
    }
}
