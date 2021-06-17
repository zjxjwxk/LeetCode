package com.zjxjwxk.leetcode._0374_Guess_Number_Higher_or_Lower;

/**
 * 二分查找
 * @author Xinkang Wu
 * @date 2021/6/17 23:25
 */
public class Solution {

    public int guessNumber(int n) {
        int left = 1, right = n, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (guess(mid) == -1) {
                right = mid - 1;
            } else if (guess(mid) == 1) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private int guess(int num) {
        // 由题目给定
        return -1;
    }
}
