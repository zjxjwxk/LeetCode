package com.zjxjwxk.leetcode._1122_Relative_Sort_Array;

/**
 * 计数排序
 * @author Xinkang Wu
 * @date 2020/11/14 13:21
 */
public class Solution2 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = Integer.MIN_VALUE;
        for (int num : arr1) {
            max = Math.max(num, max);
        }
        int[] counts = new int[max + 1];
        for (int num : arr1) {
            ++counts[num];
        }
        int index = 0;
        for (int num : arr2) {
            for (int i = 0; i < counts[num]; ++i) {
                arr1[index++] = num;
            }
            counts[num] = 0;
        }
        for (int num = 0; num < counts.length; ++num) {
            for (int j = 0; j < counts[num]; ++j) {
                arr1[index++] = num;
            }
        }
        return arr1;
    }
}
