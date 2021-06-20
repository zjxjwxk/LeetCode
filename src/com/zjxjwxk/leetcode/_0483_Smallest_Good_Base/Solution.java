package com.zjxjwxk.leetcode._0483_Smallest_Good_Base;

/**
 * 二分查找
 * @author Xinkang Wu
 * @date 2021/6/20 16:00
 */
public class Solution {

    static final int MAX_DIGIT = 64;

    public String smallestGoodBase(String n) {
        long num = Long.parseLong(n);
        long ans = Long.MAX_VALUE;
        for (int digit = 2; digit <= MAX_DIGIT; ++digit) {
            long left = 2, right = num, mid;
            while (left <= right) {
                mid = left + ((right - left) >> 1);
                int judge = judgeNum(digit, mid, num);
                if (judge == 1) {
                    right = mid - 1;
                } else if (judge == -1) {
                    left = mid + 1;
                } else {
                    ans = Math.min(ans, mid);
                    break;
                }
            }
        }
        return String.valueOf(ans);
    }

    private int judgeNum(int digit, long radix, long num) {
        long tempNum = 0;
        for (int i = 0; i < digit; ++i) {
            if (tempNum > (num - 1) / radix) {
                return 1;
            }
            tempNum = tempNum * radix + 1;
        }
        if (tempNum < num) {
            return -1;
        } else if (tempNum > num) {
            return 1;
        }
        return 0;
    }
}
