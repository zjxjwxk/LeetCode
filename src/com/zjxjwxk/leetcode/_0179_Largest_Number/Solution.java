package com.zjxjwxk.leetcode._0179_Largest_Number;

import java.util.Arrays;

/**
 * 排序
 * @author Xinkang Wu
 * @date 2021/4/12 13:28
 */
public class Solution {

    public String largestNumber(int[] nums) {
        int len = nums.length;
        Integer[] numArr = new Integer[len];
        for (int i = 0; i < len; ++i) {
            numArr[i] = nums[i];
        }
        Arrays.sort(numArr, (num1, num2) -> {
            int product1 = 10, product2 = 10;
            while (product1 <= num1) {
                product1 *= 10;
            }
            while (product2 <= num2) {
                product2 *= 10;
            }
            return num2 * product1 + num1 - (num1 * product2 + num2);
        });
        StringBuilder sb = new StringBuilder();
        if (numArr[0] == 0) {
            return "0";
        }
        for (int num : numArr) {
            sb.append(num);
        }
        return sb.toString();
    }
}
