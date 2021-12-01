package com.zjxjwxk.leetcode._0400_Nth_Digit;

/**
 * 直接计算
 * @author Xinkang Wu
 * @date 2021/11/30 15:19
 */
public class Solution {

    public int findNthDigit(int n) {
        int digitNum = 0, count = 9, countSum = 0;
        while ((countSum + (long) (digitNum + 1) * count + 1) <= n) {
            countSum += (digitNum + 1) * count;
            ++digitNum;
            count *= 10;
        }
        ++digitNum;
        int startNum = (int) Math.pow(10, digitNum - 1);
        int offsetIndex = n - countSum - 1;
        int offsetNum = offsetIndex / (digitNum);
        int num = startNum + offsetNum;
        int digitIndex = offsetIndex % (digitNum);
        return (num / (int) Math.pow(10, digitNum - (digitIndex + 1))) % 10;
    }
}
