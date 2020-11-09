package com.zjxjwxk.leetcode._0973_K_Closest_Points_to_Origin;

/**
 * 快速排序
 * @author Xinkang Wu
 * @date 2020/11/9 10:17 下午
 */
public class Solution2 {

    public int[][] kClosest(int[][] points, int K) {
        quickSort(points, 0, points.length - 1, K - 1);
        int[][] ans = new int[K][2];
        System.arraycopy(points, 0, ans, 0, K);
        return ans;
    }

    private void quickSort(int[][] points, int left, int right, int K) {
        int pivot = points[left][0] * points[left][0] + points[left][1] * points[left][1], i = left, j = right;
        while (i != j) {
            while (i != j && points[j][0] * points[j][0] + points[j][1] * points[j][1] >= pivot) {
                --j;
            }
            if (i != j) {
                swap(points, i, j);
                ++i;
            }
            if (i != j) {
                while (i != j && points[i][0] * points[i][0] + points[i][1] * points[i][1] < pivot) {
                    ++i;
                }
                if (i != j) {
                    swap(points, i, j);
                    --j;
                }
            }
        }
        if (K < i) {
            quickSort(points, left, i - 1, K);
        } else if (K > i) {
            quickSort(points, i + 1, right, K);
        }
    }

    private void swap(int[][] arr, int index1, int index2) {
        int[] temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
