package com.zjxjwxk.leetcode._0327_Count_of_Range_Sum;

/**
 * 归并排序（分治计算下标对数）
 * @author Xinkang Wu
 * @date 2020/11/7 10:54 上午
 */
public class Solution {

    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] sum = new long[nums.length + 1];
        for (int i = 1; i < sum.length; ++i) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        return mergeSortAndCount(sum, 0, sum.length - 1, lower, upper);
    }

    private int mergeSortAndCount(long[] sum, int left, int right, int lower, int upper) {
        if (left == right) {
            return 0;
        }
        int mid = left + ((right - left) >> 1);
        int count = mergeSortAndCount(sum, left, mid, lower, upper) + mergeSortAndCount(sum, mid + 1, right, lower, upper);
        int i = left, l = mid + 1, r = mid + 1;
        while (i <= mid) {
            while (l <= right && sum[l] - sum[i] < lower) {
                ++l;
            }
            while (r <= right && sum[r] - sum[i] <= upper) {
                ++r;
            }
            count += r - l;
            ++i;
        }
        int p1 = left, p2 = mid + 1, index = 0;
        long[] sorted = new long[right - left + 1];
        while (p1 <= mid && p2 <= right) {
            if (sum[p1] < sum[p2]) {
                sorted[index++] = sum[p1++];
            } else {
                sorted[index++] = sum[p2++];
            }
        }
        while (p1 <= mid) {
            sorted[index++] = sum[p1++];
        }
        while (p2 <= right) {
            sorted[index++] = sum[p2++];
        }
        System.arraycopy(sorted, 0, sum, left, sorted.length);
        return count;
    }
}
