package com.zjxjwxk.leetcode._1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number;

/**
 * @author Xinkang Wu
 * @date 2020/10/26 9:40 上午
 */
public class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] counts = new int[101];
        for (int num : nums) {
            ++counts[num];
        }
        for (int i = 1; i < 101; ++i) {
            counts[i] += counts[i - 1];
        }
        for (int i = 0; i < len; ++i) {
            if (nums[i] != 0) {
                nums[i] = counts[nums[i] - 1];
            }
        }
        return nums;
    }
}
