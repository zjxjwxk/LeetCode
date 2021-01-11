package com.zjxjwxk.leetcode._0004_Median_of_Two_Sorted_Arrays;

/**
 * 二分查找
 * 时间复杂度 O(log(m+n))
 * @author Xinkang Wu
 * @date 2021/1/11 22:08
 */
public class Solution2 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length, i = 0, j = 0, k;
        boolean odd = ((len1 + len2) & 1) == 1;
        if (odd) {
            k = ((len1 + len2) >> 1) + 1;
            return getKth(nums1, nums2, k);
        } else {
            k = ((len1 + len2) >> 1);
            return (double) (getKth(nums1, nums2, k) + getKth(nums1, nums2, k + 1)) / 2;
        }
    }

    private int getKth(int[] nums1, int[] nums2, int k) {
        int i = 0, j = 0, len1 = nums1.length, len2 = nums2.length;
        while (i < len1 && j < len2) {
            if (k == 1) {
                return Math.min(nums1[i], nums2[j]);
            }
            int off = (k >> 1) - 1, p1, p2;
            if (i + off >= len1) {
                p1 = len1 - 1;
            } else {
                p1 = i + off;
            }
            if (j + off >= len2) {
                p2 = len2 - 1;
            } else {
                p2 = j + off;
            }
            if (nums1[p1] <= nums2[p2]) {
                k -= Math.min(k >> 1, len1 - i);
                i = p1 + 1;
            } else {
                k -= Math.min(k >> 1, len2 - j);
                j = p2 + 1;
            }
        }
        if (i == len1) {
            return nums2[j + k - 1];
        }
        return nums1[i + k - 1];
    }
}
