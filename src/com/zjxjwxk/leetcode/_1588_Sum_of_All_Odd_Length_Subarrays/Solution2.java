package com.zjxjwxk.leetcode._1588_Sum_of_All_Odd_Length_Subarrays;

/**
 * 数学
 * @author Xinkang Wu
 * @date 2021/9/17 16:07
 */
public class Solution2 {

    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length, ans = 0;
        for (int i = 0; i < n; ++i) {
            int leftCount = i, rightCount = n - i - 1;
            int leftOdd = (leftCount + 1) >> 1;
            int rightOdd = (rightCount + 1) >> 1;
            int leftEven = (leftCount >> 1) + 1;
            int rightEven = (rightCount >> 1) + 1;
            ans += arr[i] * (leftOdd * rightOdd + leftEven * rightEven);
        }
        return ans;
    }
}
