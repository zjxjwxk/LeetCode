package com.zjxjwxk.leetcode._0414_Third_Maximum_Number;

/**
 * 一次遍历
 * @author Xinkang Wu
 * @date 2021/10/6 12:18
 */
public class Solution2 {

    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num < second) {
                third = num;
            }
        }
        return (int) (third == Long.MIN_VALUE ? first : third);
    }
}
