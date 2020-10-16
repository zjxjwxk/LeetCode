package com.zjxjwxk.leetcode._0977_Squares_of_a_Sorted_Array;

/**
 * 双指针2
 * 直接从大到小归并排序
 * @author zjxjwxk
 * @date 2020/10/16 1:08 下午
 */
public class Solution2 {

    public int[] sortedSquares(int[] A) {
        int len = A.length, i = 0, j = len - 1, index = len - 1;
        int[] ans = new int[len];
        while (i <= j) {
            if (-A[i] > A[j]) {
                ans[index--] = A[i] * A[i];
                ++i;
            } else {
                ans[index--] = A[j] * A[j];
                --j;
            }
        }
        return ans;
    }
}
