package com.zjxjwxk.leetcode._0477_Total_Hamming_Distance;

/**
 * 逐位统计
 * @author Xinkang Wu
 * @date 2021/5/28 21:33
 */
public class Solution {

    public int totalHammingDistance(int[] nums) {
        int ans = 0, len = nums.length;
        for (int i = 0; i < 30; ++i) {
            int count = 0;
            for (int num : nums) {
                count += (num >> i) & 1;
            }
            ans += count * (len - count);
        }
        return ans;
    }
}
