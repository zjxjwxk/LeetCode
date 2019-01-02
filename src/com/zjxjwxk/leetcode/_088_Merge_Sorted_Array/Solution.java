package com.zjxjwxk.leetcode._088_Merge_Sorted_Array;

/**
 * 双指针（开辟新数组）
 * @author zjxjwxk
 */
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int[] result = new int[m + n];
        int k = 0;
        while (i < m && j < n) {
            result[k++] = nums1[i] <= nums2[j] ? nums1[i++] : nums2[j++];
        }
        while (i < m) {
            result[k++] = nums1[i++];
        }
        while (j < n) {
            result[k++] = nums2[j++];
        }
        for (k = 0; k < m + n; k++) {
            nums1[k] = result[k];
        }
    }
}
