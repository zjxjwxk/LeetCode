package com.zjxjwxk.leetcode._0075_Sort_Colors;

/**
 * 双指针（0左移，2右移）
 * @author zjxjwxk
 * @date 2020/10/7 11:51 上午
 */
public class Solution4 {

    public void sortColors(int[] nums) {
        int len = nums.length, p1 = 0, p2 = len - 1;
        for (int i = 0; i <= p2; ++i) {
            if (nums[i] == 2) {
                while (i <= p2 && nums[p2] == 2) {
                    --p2;
                }
                if (i < p2) {
                    swap(nums, i, p2);
                }
            }
            if (nums[i] == 0) {
                swap(nums, p1, i);
                ++p1;
            }
        }
    }

    private void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2};
        solution.sortColors(nums);
    }
}
