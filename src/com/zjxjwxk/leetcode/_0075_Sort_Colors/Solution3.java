package com.zjxjwxk.leetcode._0075_Sort_Colors;

/**
 * 双指针
 * @author zjxjwxk
 * @date 2020/10/7 11:27 上午
 */
public class Solution3 {

    public void sortColors(int[] nums) {
        int p1 = 0, p2 = 0, len = nums.length;
        for (int i = 0; i < len; ++i) {
            if (nums[i] == 1) {
                swap(nums, p2, i);
                ++p2;
            }
            if (nums[i] == 0) {
                swap(nums, p1, i);
                if (p1 < p2) {
                    swap(nums, p2, i);
                }
                ++p1;
                ++p2;
            }
        }
    }

    private void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
