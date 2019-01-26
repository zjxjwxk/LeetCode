package com.zjxjwxk.leetcode._035_Search_Insert_Position;

/**
 * 直接遍历搜索
 * @author zjxjwxk
 */
public class Solution {

    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, 0));
    }
}
