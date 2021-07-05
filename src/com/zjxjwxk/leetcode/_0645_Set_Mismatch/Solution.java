package com.zjxjwxk.leetcode._0645_Set_Mismatch;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/7/4 22:03
 */
public class Solution {

    public int[] findErrorNums(int[] nums) {
        int len = nums.length;
        int[] counts = new int[len + 1];
        int[] ans = new int[2];
        for (int num : nums) {
            if (++counts[num] == 2) {
                ans[0] = num;
            }
        }
        for (int i = 1; i <= len; ++i) {
            if (counts[i] == 0) {
                ans[1] = i;
            }
        }
        return ans;
    }
}
