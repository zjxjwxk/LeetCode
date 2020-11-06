package com.zjxjwxk.leetcode._1356_Sort_Integers_by_The_Number_of_1_Bits;

import java.util.*;

/**
 * @author Xinkang Wu
 * @date 2020/11/6 10:45 上午
 */
public class Solution {

    public int[] sortByBits(int[] arr) {
        int[] oneCounts = new int[10001];
        for (int i = 1; i <= 10000; ++i) {
            oneCounts[i] = oneCounts[i >> 1] + (i & 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        Comparator<Integer> comparator = (num1, num2) -> {
            if (oneCounts[num1] != oneCounts[num2]) {
                return oneCounts[num1] - oneCounts[num2];
            } else {
                return num1 - num2;
            }
        };
        list.sort(comparator);
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
