package com.zjxjwxk.leetcode._0628_Maximum_Product_of_Three_Numbers;

/**
 * 一次遍历
 * @author Xinkang Wu
 * @date 2021/1/20 22:40
 */
public class Solution {

    public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
            if (num > max3) {
                max1 = max2;
                max2 = max3;
                max3 = num;
            } else if (num > max2) {
                max1 = max2;
                max2 = num;
            } else if (num > max1) {
                max1 = num;
            }
        }
        return Math.max(min1 * min2 * max3, max1 * max2 * max3);
    }
}
