package com.zjxjwxk.leetcode._053_Maximum_Subarray;

/**
 * @author zjxjwxk
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < len; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max value : " + solution.maxSubArray(num));
    }
}
