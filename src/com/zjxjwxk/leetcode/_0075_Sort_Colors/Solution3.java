package com.zjxjwxk.leetcode._0075_Sort_Colors;

/**
 * 双指针（0和1左移）
 * @author zjxjwxk
 * @date 2020/10/7 11:27 上午
 */
public class Solution3 {

    public void sortColors(int[] nums) {
        int p0 = 0, p1 = 0, len = nums.length;
        for (int i = 0; i < len; ++i) {
            if (nums[i] == 1) {
                swap(nums, p1, i);
                ++p1;
            }
            if (nums[i] == 0) {
                swap(nums, p0, i);
                if (p0 < p1) {
                    swap(nums, p1, i);
                }
                ++p0;
                ++p1;
            }
        }
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
