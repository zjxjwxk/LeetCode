package com.zjxjwxk.leetcode._1738_Find_Kth_Largest_XOR_Coordinate_Value;

import java.util.Random;

/**
 * 二维前缀和+三路快速选择算法
 * @author Xinkang Wu
 * @date 2021/5/19 12:44
 */
public class Solution2 {

    private Random random;

    public int kthLargestValue(int[][] matrix, int k) {
        this.random = new Random();
        int m = matrix.length, n = matrix[0].length, index = 0;
        int[] sum = new int[m * n];
        int[][] value = new int[m + 1][n + 1];
        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                value[i][j] = value[i - 1][j] ^ value[i][j - 1] ^ value[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                sum[index++] = value[i][j];
            }
        }
        return quickSelect(sum, 0, sum.length - 1, k);
    }

    private int quickSelect(int[] arr, int left, int right, int k) {
        int pivot = left + random.nextInt(right - left + 1);
        swap(arr, pivot, right);
        int l = left, r = left;
        for (int j = left; j <= right; ++j) {
            if (arr[j] > arr[right]) {
                swap(arr, r++, j);
                swap(arr, l++, r - 1);
            } else if (arr[j] == arr[right]) {
                swap(arr, r++, j);
            }
        }
        if (k - 1 >= l && k - 1 < r) {
            return arr[k - 1];
        }
        if (k - 1 >= r) {
            return quickSelect(arr, r, right, k);
        } else {
            return quickSelect(arr, left, l - 1, k);
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
