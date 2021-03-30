package com.zjxjwxk.leetcode._0074_Search_a_2D_Matrix;

/**
 * 两次二分搜索
 * @author Xinkang Wu
 * @date 2021/3/30 21:19
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = binarySearchRow(matrix, target);
        if (row < 0) {
            return false;
        }
        int col = binarySearchCol(matrix[row], target);
        return matrix[row][col] == target;
    }

    private int binarySearchRow(int[][] arr, int target) {
        int left = 0, right = arr.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (target < arr[mid][0]) {
                right = mid - 1;
            } else if (target > arr[mid][0]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right;
    }

    private int binarySearchCol(int[] arr, int target) {
        int left = 0, right = arr.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (target < arr[mid]) {
                right = mid - 1;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}
