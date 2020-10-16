package com.zjxjwxk.leetcode._0977_Squares_of_a_Sorted_Array;

/**
 * 双指针1
 * 二分搜索找到分界点，并从小到大归并排序
 * @author zjxjwxk
 * @date 2020/10/16 11:46 上午
 */
public class Solution {

    public int[] sortedSquares(int[] A) {
        int len = A.length, left = 0, right = len - 1;
        int neg = findNegIndex(A, left, right);
        int i = neg, j = neg + 1, index = 0;
        int[] ans = new int[len];
        while (i >= 0 && j < len) {
            if (-A[i] < A[j]) {
                ans[index++] = A[i] * A[i];
                --i;
            } else {
                ans[index++] = A[j] * A[j];
                ++j;
            }
        }
        while (i >= 0) {
            ans[index++] = A[i] * A[i];
            --i;
        }
        while (j < len) {
            ans[index++] = A[j] * A[j];
            ++j;
        }
        return ans;
    }

    private int findNegIndex(int[] A, int left, int right) {
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (A[mid] < 0) {
                left = mid + 1;
            } else if (A[mid] > 0) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}
