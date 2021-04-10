package com.zjxjwxk.leetcode._0154_Find_Minimum_in_Rotated_Sorted_Array_II;

/**
 * 二分查找
 * @author Xinkang Wu
 * @date 2021/4/10 22:50
 */
public class Solution {

    public int findMin(int[] numbers) {
        int left = 0, right = numbers.length - 1, mid;
        while (left < right) {
            mid = left + ((right - left) >> 1);
            while (right != mid && numbers[mid] == numbers[right]) {
                --right;
            }
            if (numbers[mid] <= numbers[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return numbers[left];
    }
}
