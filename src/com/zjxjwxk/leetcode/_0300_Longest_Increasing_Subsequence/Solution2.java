package com.zjxjwxk.leetcode._0300_Longest_Increasing_Subsequence;

/**
 * 贪心+二分查找
 * @author Xinkang Wu
 * @date 2020/11/28 20:38
 */
public class Solution2 {

    public int lengthOfLIS(int[] nums) {
        int len = nums.length, ans = 1;
        if (len == 0) {
            return 0;
        }
        int[] d = new int[len + 1];
        d[1] = nums[0];
        for (int num : nums) {
            if (num > d[ans]) {
                d[++ans] = num;
            } else if (num < d[ans]) {
                d[findIndex(d, 1, ans, num)] = num;
            }
        }
        return ans;
    }

    private int findIndex(int[] d, int left, int right, int target) {
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (target > d[mid]) {
                left = mid + 1;
            } else if (target < d[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}
