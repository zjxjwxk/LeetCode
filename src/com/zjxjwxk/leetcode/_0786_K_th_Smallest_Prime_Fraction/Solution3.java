package com.zjxjwxk.leetcode._0786_K_th_Smallest_Prime_Fraction;

/**
 * 二分查找+双指针
 * 时间复杂度O(nlogC)
 * 空间复杂度O(1)
 * @author Xinkang Wu
 * @date 2021/11/29 14:34
 */
public class Solution3 {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        double left = 0, right = 1, mid;
        int len = arr.length;
        while (true) {
            mid = left + (right - left) / 2;
            int i = 0, j = 1, count = 0, x = 0, y = 1;
            while (j < len) {
                while ((double) arr[i] / arr[j] < mid) {
                    if (arr[i] * y > arr[j] * x) {
                        x = arr[i];
                        y = arr[j];
                    }
                    ++i;
                }
                count += i;
                ++j;
            }
            if (count < k) {
                left = mid;
            } else if (count > k) {
                right = mid;
            } else {
                return new int[]{x, y};
            }
        }
    }
}