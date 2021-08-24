package com.zjxjwxk.leetcode._1337_The_K_Weakest_Rows_in_a_Matrix;

import java.util.Arrays;

/**
 * 二分查找+快速选择
 * @author Xinkang Wu
 * @date 2021/8/24 13:54
 */
public class Solution3 {

    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[][] counts = new int[m][2];
        for (int i = 0; i < m; ++i) {
            counts[i][0] = binarySearch(mat[i]);
            counts[i][1] = i;
        }
        quickSelect(counts, 0, m - 1, k);
        int[][] kRows = new int[k][2];
        System.arraycopy(counts, 0, kRows, 0, k);
        Arrays.sort(kRows, (row1, row2) -> {
            if (row1[0] != row2[0]) {
                return row1[0] - row2[0];
            } else {
                return row1[1] - row2[1];
            }
        });
        int[] ans = new int[k];
        for (int i = 0; i < k; ++i) {
            ans[i] = kRows[i][1];
        }
        return ans;
    }

    private void quickSelect(int[][] counts, int l, int r, int k) {
        int pos = partition(counts, l, r);
        if (pos < k - 1) {
            quickSelect(counts, pos + 1, r, k);
        } else if (pos > k - 1) {
            quickSelect(counts, l, pos - 1, k);
        }
    }

    private int partition(int[][] counts, int l, int r) {
        int pivot = (int) (Math.random() * (r - l + 1) + l);
        swap(counts, pivot, r);
        int i = l - 1;
        for (int j = l; j < r; ++j) {
            if (compare(counts, j, r)) {
                swap(counts, j, ++i);
            }
        }
        swap(counts, i + 1, r);
        return i + 1;
    }

    private void swap(int[][] counts, int x, int y) {
        int[] temp = counts[x];
        counts[x] = counts[y];
        counts[y] = temp;
    }

    private boolean compare(int[][] counts, int x, int y) {
        if (counts[x][0] != counts[y][0]) {
            return counts[x][0] < counts[y][0];
        } else {
            return counts[x][1] < counts[y][1];
        }
    }

    private int binarySearch(int[] row) {
        int left = 0, right = row.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (row[mid] == 1) {
                left = mid + 1;
            } else if (row[mid] == 0) {
                right = mid - 1;
            }
        }
        return left;
    }
}
