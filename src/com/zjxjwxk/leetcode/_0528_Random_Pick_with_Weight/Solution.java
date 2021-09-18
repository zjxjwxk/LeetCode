package com.zjxjwxk.leetcode._0528_Random_Pick_with_Weight;

/**
 * 前缀和 + 二分查找
 * @author Xinkang Wu
 * @date 2021/9/18 14:31
 */
public class Solution {

    private final int len;
    private final int[] preSum;

    public Solution(int[] w) {
        len = w.length;
        preSum = new int[len + 1];
        for (int i = 1; i <= len; ++i) {
            preSum[i] = preSum[i - 1] + w[i - 1];
        }
    }

    public int pickIndex() {
        int randNum = (int) (Math.random() * preSum[len]) + 1;
        return binarySearch(preSum, randNum) - 1;
    }

    private int binarySearch(int[] preSum, int target) {
        int left = 0, right = preSum.length - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (preSum[mid] < target) {
                left = mid + 1;
            } else if (preSum[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}
