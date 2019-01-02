package com.zjxjwxk.leetcode._088_Merge_Sorted_Array;

/**
 * 双指针（逆向填充）
 * @author zjxjwxk
 */
public class Solution2 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m-- + n-- - 1;
        while (m >= 0 && n >= 0) {
            nums1[k--] = nums1[m] >= nums2[n] ? nums1[m--] : nums2[n--];
        }
        while (n >= 0) {
            nums1[k--] = nums2[n--];
        }
    }
}
