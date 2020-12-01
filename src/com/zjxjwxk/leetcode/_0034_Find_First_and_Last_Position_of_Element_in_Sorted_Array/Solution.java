package com.zjxjwxk.leetcode._0034_Find_First_and_Last_Position_of_Element_in_Sorted_Array;

/**
 * @author Xinkang Wu
 * @date 2020/12/1 20:08
 */
public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                int index = mid;
                ans[0] = ans[1] = mid;
                while (index >= 0 && nums[index] == target) {
                    --index;
                }
                ans[0] = index + 1;
                index = mid;
                while (index < nums.length && nums[index] == target) {
                    ++index;
                }
                ans[1] = index - 1;
                break;
            }
        }
        return ans;
    }
}
