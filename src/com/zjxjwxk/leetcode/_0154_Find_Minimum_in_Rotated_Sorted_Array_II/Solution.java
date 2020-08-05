package com.zjxjwxk.leetcode._0154_Find_Minimum_in_Rotated_Sorted_Array_II;

/**
 * @author zjxjwxk
 * @date 2020/8/5 10:54 下午
 */
public class Solution {

    public static int findMin(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        int left = 0, right = numbers.length - 1, mid = left;
        while (numbers[left] >= numbers[right]) {
            if (right - left == 1) {
                mid = right;
                break;
            }
            mid = left + ((right - left) >> 1);
            if (numbers[left] == numbers[right] && numbers[mid] == numbers[left]) {
                return minInOrder(numbers, left, right);
            }
            if (numbers[mid] >= numbers[left]) {
                left = mid;
            } else if (numbers[mid] <= numbers[right]) {
                right = mid;
            }
        }
        return numbers[mid];
    }

    public static int minInOrder(int[] numbers, int left, int right) {
        int min = numbers[left];
        for (int i = left + 1; i <= right; ++i) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{1, 0, 1, 1, 1}));
        System.out.println(findMin(new int[]{1, 1, 1, 0, 1}));
    }
}
