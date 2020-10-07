package com.zjxjwxk.leetcode._0075_Sort_Colors;

/**
 * 单指针
 * @author zjxjwxk
 * @date 2020/10/7 11:11 上午
 */
public class Solution2 {

    public void sortColors(int[] nums) {
        int p = 0, len = nums.length, temp;
        for (int i = 0; i < len; ++i) {
            if (nums[i] == 0) {
                temp = nums[p];
                nums[p] = nums[i];
                nums[i] = temp;
                ++p;
            }
        }
        for (int i = p; i < len; ++i) {
            if (nums[i] == 1) {
                temp = nums[p];
                nums[p] = nums[i];
                nums[i] = temp;
                ++p;
            }
        }
    }
}
