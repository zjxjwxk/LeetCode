package com.zjxjwxk.leetcode._1818_Minimum_Absolute_Sum_Difference;

import java.util.Arrays;

/**
 * 排序 + 二分查找
 * @author Xinkang Wu
 * @date 2021/7/14 16:10
 */
public class Solution {

    private static final int MOD = 1000000007;

    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int len = nums1.length, sum = 0, maxDiff = 0;
        int[] sortedNums1 = new int[len];
        System.arraycopy(nums1, 0, sortedNums1, 0, len);
        Arrays.sort(sortedNums1);
        for (int i = 0; i < len; ++i) {
            int diff = Math.abs(nums1[i] - nums2[i]);
            sum = (sum + diff) % MOD;
            int lessIndex = binarySearch(sortedNums1, nums2[i]);
            if (lessIndex < len - 1) {
                maxDiff = Math.max(maxDiff, diff - (sortedNums1[lessIndex + 1] - nums2[i]));
            }
            if (lessIndex >= 0) {
                maxDiff = Math.max(maxDiff, diff - (nums2[i] - sortedNums1[lessIndex]));
            }
        }
        return (sum - maxDiff + MOD) % MOD;
    }

    private int binarySearch(int[] sortedNum1, int target) {
        int left = 0, right = sortedNum1.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (sortedNum1[mid] < target) {
                left = mid + 1;
            } else if (sortedNum1[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}
