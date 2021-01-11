package com.zjxjwxk.leetcode._0004_Median_of_Two_Sorted_Arrays;

/**
 * 双指针直接遍历
 * 时间复杂度 O(m+n)
 * @author Xinkang Wu
 * @date 2021/1/11 15:45
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length, totalLen = len1 + len2, mid = (totalLen >> 1), index = -1, i = 0, j = 0, preNum = 0;
        while (i < len1 && j < len2) {
            int curNum;
            if (nums1[i] <= nums2[j]) {
                curNum = nums1[i++];
            } else {
                curNum = nums2[j++];
            }
            ++index;
            if (index == mid) {
                return findMedian(totalLen, preNum, curNum);
            }
            preNum = curNum;
        }
        while (i < len1) {
            int curNum = nums1[i++];
            ++index;
            if (index == mid) {
                return findMedian(totalLen, preNum, curNum);
            }
            preNum = curNum;
        }
        while (j < len2) {
            int curNum = nums2[j++];
            ++index;
            if (index == mid) {
                return findMedian(totalLen, preNum, curNum);
            }
            preNum = curNum;
        }
        return 0;
    }

    private double findMedian(int totalLen, int preNum, int curNum) {
        if ((totalLen & 1) == 0) {
            return (double) (curNum + preNum) / 2;
        } else {
            return curNum;
        }
    }
}
