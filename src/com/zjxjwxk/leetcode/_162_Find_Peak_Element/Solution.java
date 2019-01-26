package com.zjxjwxk.leetcode._162_Find_Peak_Element;

/**
 * @author zjxjwxk
 */
public class Solution {

    public static int findPeakElement(int[] nums) {

        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid + 1] > nums[mid]) {
                start = mid + 1;
            } else if (nums[mid + 1] < nums[mid]) {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 1};
        System.out.println(findPeakElement(num));
    }
}
