package com.zjxjwxk.leetcode._0080_Remove_Duplicates_from_Sorted_Array_II;

/**
 * 双指针
 * @author Xinkang Wu
 * @date 2021/4/6 23:33
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        int len = nums.length, count = 2;
        for (int i = 2; i < len; ++i) {
            if (nums[i] != nums[count - 2]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
