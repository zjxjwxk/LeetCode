package com.zjxjwxk.leetcode._0075_Sort_Colors;

/**
 * 双指针简化版（0左移，2右移）
 *
 * @author Xinkang Wu
 * @date 2025/9/12 15:56
 */
public class Solution5 {

    public void sortColors(int[] nums) {
        int index = 0, redIndex = 0, blueIndex = nums.length - 1;
        while (index <= blueIndex) {
            if (nums[index] == 0) {
                swap(nums, redIndex++, index++);
            } else if (nums[index] == 2) {
                swap(nums, blueIndex--, index);
            } else {
                ++index;
            }
        }
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
