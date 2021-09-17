package com.zjxjwxk.leetcode._1588_Sum_of_All_Odd_Length_Subarrays;

/**
 * 前缀和
 * @author Xinkang Wu
 * @date 2021/9/17 16:07
 */
public class Solution {

    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length, ans = 0;
        int[] preSum = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            preSum[i] = preSum[i - 1] + arr[i - 1];
        }
        for (int len = 1; len <= n; len += 2) {
            for (int left = 0; left + len <= n; ++left) {
                ans += preSum[left + len] - preSum[left];
            }
        }
        return ans;
    }
}
