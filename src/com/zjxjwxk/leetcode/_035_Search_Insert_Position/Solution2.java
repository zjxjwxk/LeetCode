package com.zjxjwxk.leetcode._035_Search_Insert_Position;

import com.zjxjwxk.leetcode._003_Longest_Substring_Without_Repeating_Characters.Solution;

/**
 * 二分搜索
 * @author zjxjwxk
 */
public class Solution2 {

    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.searchInsert(nums, 2));
    }
}
