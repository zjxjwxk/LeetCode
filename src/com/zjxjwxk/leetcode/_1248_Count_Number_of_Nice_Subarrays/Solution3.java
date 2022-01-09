package com.zjxjwxk.leetcode._1248_Count_Number_of_Nice_Subarrays;

/**
 * 前缀和+计数
 * @author Xinkang Wu
 * @date 2022/1/8 20:41
 */
public class Solution3 {

    public int numberOfSubarrays(int[] nums, int k) {
        int oddCount = 0, len = nums.length, ans = 0;
        int[] counts = new int[len + 1];
        counts[0] = 1;
        for (int num : nums) {
            oddCount += (num & 1);
            ++counts[oddCount];
            if (oddCount >= k) {
                ans += counts[oddCount - k];
            }
        }
        return ans;
    }
}
