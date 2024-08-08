package com.zjxjwxk.leetcode._3131_Find_the_Integer_Added_to_Array_I;

/**
 * @author Xinkang Wu
 * @date 2024/8/8 23:10
 */
public class Solution {

    public int addedInteger(int[] nums1, int[] nums2) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums1.length; ++i) {
            max1 = Math.max(max1, nums1[i]);
            max2 = Math.max(max2, nums2[i]);
        }
        return max2 - max1;
    }
}
