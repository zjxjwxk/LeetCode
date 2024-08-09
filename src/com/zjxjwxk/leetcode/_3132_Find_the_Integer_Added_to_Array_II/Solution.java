package com.zjxjwxk.leetcode._3132_Find_the_Integer_Added_to_Array_II;

import java.util.Arrays;

/**
 * 排序+枚举
 * @author Xinkang Wu
 * @date 2024/8/10 00:21
 */
public class Solution {

    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int start = 2; start >= 0; --start) {
            int index1 = start, index2 = 0, diff = nums1[index1] - nums2[index2];
            while (index1 < nums1.length && index2 < nums2.length) {
                if (nums1[index1] - nums2[index2] == diff) {
                    ++index2;
                }
                ++index1;
            }
            if (index2 == nums2.length) {
                return -diff;
            }
        }
        return 0;
    }
}
