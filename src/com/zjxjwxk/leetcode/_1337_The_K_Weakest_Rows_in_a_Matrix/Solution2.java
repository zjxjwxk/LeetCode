package com.zjxjwxk.leetcode._1337_The_K_Weakest_Rows_in_a_Matrix;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 二分查找+堆
 * @author Xinkang Wu
 * @date 2021/8/24 13:54
 */
public class Solution2 {

    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[][] counts = new int[m][2];
        for (int i = 0; i < m; ++i) {
            counts[i][0] = binarySearch(mat[i]);
            counts[i][1] = i;
        }
        Queue<int[]> minHeap = new PriorityQueue<>(m, (count1, count2) -> {
            if (count1[0] != count2[0]) {
                return count1[0] - count2[0];
            } else {
                return count1[1] - count2[1];
            }
        });
        for (int[] count : counts) {
            minHeap.offer(count);
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; ++i) {
            ans[i] = minHeap.poll()[1];
        }
        return ans;
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
