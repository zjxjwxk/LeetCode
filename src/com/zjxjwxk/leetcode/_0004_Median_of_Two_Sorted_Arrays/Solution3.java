package com.zjxjwxk.leetcode._0004_Median_of_Two_Sorted_Arrays;

/**
 * 二分查找
 * 时间复杂度 O(log(m+n))
 * @author Xinkang Wu
 * @date 2022/7/15 00:49
 */
public class Solution3 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length, totalLen = len1 + len2, k1 = (totalLen) >> 1, k2 = k1 + 1;
        if ((totalLen & 1) == 0) {
            int mid1 = getKthNum(nums1, nums2, k1);
            int mid2 = getKthNum(nums1, nums2, k2);
            return (mid1 + mid2) / 2.0;
        } else {
            return getKthNum(nums1, nums2, k2);
        }
    }

    private int getKthNum(int[] nums1, int[] nums2, int k) {
        int left1 = 0, right1 = nums1.length - 1;
        int left2 = 0, right2 = nums2.length - 1;
        while (true) {
            if (left1 > right1) {
                return nums2[left2 + k - 1];
            }
            if (left2 > right2) {
                return nums1[left1 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[left1], nums2[left2]);
            }
            int offset = (k >> 1) - 1;
            int index1 = Math.min(right1, left1 + offset);
            int index2 = Math.min(right2, left2 + offset);
            if (nums1[index1] <= nums2[index2]) {
                k = k - (index1 - left1 + 1);
                left1 = index1 + 1;
            } else {
                k = k - (index2 - left2 + 1);
                left2 = index2 + 1;
            }
        }
    }
}
