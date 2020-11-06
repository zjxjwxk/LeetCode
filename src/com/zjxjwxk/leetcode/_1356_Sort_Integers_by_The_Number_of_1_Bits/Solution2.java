package com.zjxjwxk.leetcode._1356_Sort_Integers_by_The_Number_of_1_Bits;

import java.util.Arrays;

/**
 * @author Xinkang Wu
 * @date 2020/11/6 12:49 下午
 */
public class Solution2 {

    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = Integer.bitCount(arr[i]) * 100000 + arr[i];
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = arr[i] % 100000;
        }
        return arr;
    }
}
