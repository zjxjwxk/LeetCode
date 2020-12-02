package com.zjxjwxk.leetcode._0321_Create_Maximum_Number;

/**
 * 单调栈
 * @author Xinkang Wu
 * @date 2020/12/2 18:36
 */
public class Solution {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] maxMerged = new int[k];
        for (int i = Math.max(0, k - nums2.length); i <= k && i <= nums1.length; ++i) {
            int[] maxSequence1 = getMaxSequence(nums1, i);
            int[] maxSequence2 = getMaxSequence(nums2, k - i);
            int[] merged = merge(maxSequence1, maxSequence2);
            if (compare(merged, 0, maxMerged, 0)) {
                maxMerged = merged;
            }
        }
        return maxMerged;
    }

    private int[] getMaxSequence(int[] nums, int len) {
        if (len == 0) {
            return new int[]{};
        }
        int[] maxSequence = new int[len];
        int popCount = 0, maxPopCount = nums.length - len, index = 0;
        for (int num : nums) {
            while (index != 0 && num > maxSequence[index - 1] && popCount < maxPopCount) {
                --index;
                ++popCount;
            }
            if (index < len) {
                maxSequence[index++] = num;
            } else {
                ++popCount;
            }
        }
        return maxSequence;
    }

    private int[] merge(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0, j = 0, index = 0;
        while (i < nums1.length || j < nums2.length) {
            if (compare(nums1, i, nums2, j)) {
                merged[index++] = nums1[i++];
            } else {
                merged[index++] = nums2[j++];
            }
        }
        return merged;
    }

    private boolean compare(int[] nums1, int start1, int[] nums2, int start2) {
        while (start1 < nums1.length && start2 < nums2.length) {
            if (nums1[start1] > nums2[start2]) {
                return true;
            } else if (nums1[start1] < nums2[start2]) {
                return false;
            }
            ++start1;
            ++start2;
        }
        return (nums1.length - start1) > (nums2.length - start2);
    }
}
