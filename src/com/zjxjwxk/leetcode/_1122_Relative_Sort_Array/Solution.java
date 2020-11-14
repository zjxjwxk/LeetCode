package com.zjxjwxk.leetcode._1122_Relative_Sort_Array;

import java.util.*;

/**
 * 自定义排序
 * @author Xinkang Wu
 * @date 2020/11/14 12:50
 */
public class Solution {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; ++i) {
            map.put(arr2[i], i);
        }
        Comparator<Integer> comparator = (num1, num2) -> {
            Integer index1 = map.get(num1), index2 = map.get(num2);
            if (index1 != null) {
                if (index2 != null) {
                    return index1 - index2;
                } else {
                    return -1;
                }
            } else {
                if (index2 != null) {
                    return 1;
                } else {
                    return num1 - num2;
                }
            }
        };
        Integer[] integerArr1 = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; ++i) {
            integerArr1[i] = arr1[i];
        }
        Arrays.sort(integerArr1, comparator);
        for (int i = 0; i < arr1.length; ++i) {
            arr1[i] = integerArr1[i];
        }
        return arr1;
    }
}
