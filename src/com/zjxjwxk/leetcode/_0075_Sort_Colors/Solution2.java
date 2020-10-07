package com.zjxjwxk.leetcode._0075_Sort_Colors;

/**
 * 单指针
 * @author zjxjwxk
 * @date 2020/10/7 11:11 上午
 */
public class Solution2 {

    public void sortColors(int[] nums) {
        int p = 0, len = nums.length;
        for (int i = 0; i < len; ++i) {
            if (nums[i] == 0) {
                swap(nums, p, i);
                ++p;
            }
        }
        for (int i = p; i < len; ++i) {
            if (nums[i] == 1) {
                swap(nums, p, i);
                ++p;
            }
        }
    }

    private void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
