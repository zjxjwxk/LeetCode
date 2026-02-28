package com.zjxjwxk.leetcode._0004_Median_of_Two_Sorted_Arrays;

/**
 * 二分查找
 * 时间复杂度 O(log(m+n))
 * @author Xinkang Wu
 * @date 2022/7/15 00:49
 */
public class Solution3 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        if (((len1 + len2) & 1) == 0) {
            int k = (len1 + len2) >> 1;
            return (getKthNum(nums1, nums2, k) + getKthNum(nums1, nums2, k + 1)) / 2.0d;
        } else {
            int k = (len1 + len2 + 1) >> 1;
            return getKthNum(nums1, nums2, k);
        }
    }

    private int getKthNum(int[] nums1, int[] nums2, int k) {
        int index1 = 0, index2 = 0, len1 = nums1.length, len2 = nums2.length;
        while (k > 1 && index1 < len1 && index2 < len2) {
            int mid1 = Math.min(index1 + (k >> 1) - 1, len1 - 1);
            int mid2 = Math.min(index2 + (k >> 1) - 1, len2 - 1);
            if (nums1[mid1] <= nums2[mid2]) {
                k -= mid1 - index1 + 1;
                index1 = mid1 + 1;
            } else {
                k -= mid2 - index2 + 1;
                index2 = mid2 + 1;
            }
        }
        if (index1 == len1) {
            return nums2[index2 + k - 1];
        }
        if (index2 == len2) {
            return nums1[index1 + k - 1];
        }
        return Math.min(nums1[index1], nums2[index2]);
    }
}
