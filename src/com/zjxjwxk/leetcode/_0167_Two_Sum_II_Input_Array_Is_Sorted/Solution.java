package com.zjxjwxk.leetcode._0167_Two_Sum_II_Input_Array_Is_Sorted;

/**
 * 双指针
 *
 * @author Xinkang Wu
 * @date 2025/10/15 22:19
 */
public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum < target) {
                ++i;
            } else if (sum > target) {
                --j;
            } else {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{};
    }
}
