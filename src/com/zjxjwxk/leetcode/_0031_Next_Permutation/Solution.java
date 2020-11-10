package com.zjxjwxk.leetcode._0031_Next_Permutation;

/**
 * 两次遍历
 * @author Xinkang Wu
 * @date 2020/11/10 8:35 下午
 */
public class Solution {

    public void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            --i;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j > i && nums[j] <= nums[i]) {
                --j;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            ++i;
            --j;
        }
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp;
        temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
