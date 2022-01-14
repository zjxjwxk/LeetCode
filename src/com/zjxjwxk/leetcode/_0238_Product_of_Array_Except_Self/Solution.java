package com.zjxjwxk.leetcode._0238_Product_of_Array_Except_Self;

/**
 * 前缀积+后缀积
 * 空间复杂度：O(1)（不包括答案数组）
 * @author Xinkang Wu
 * @date 2022/1/13 16:40
 */
public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n;
        if (nums == null || (n = nums.length) == 0) {
            return new int[]{};
        }
        int[] ans = new int[n];
        ans[n - 1] = 1;
        for (int i = n - 2; i >= 0; --i) {
            ans[i] = ans[i + 1] * nums[i + 1];
        }
        int prefixProduct = 1;
        for (int i = 0; i < n; ++i) {
            ans[i] = prefixProduct * ans[i];
            prefixProduct *= nums[i];
        }
        return ans;
    }
}
