package com.zjxjwxk.leetcode._1846_Maximum_Element_After_Decreasing_and_Rearranging;

import java.util.Arrays;

/**
 * 排序+贪心
 * 时间复杂度O(nlogn)
 * 空间复杂度O(logn)
 * @author Xinkang Wu
 * @date 2021/7/15 09:20
 */
public class Solution {

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        arr[0] = 1;
        for (int i = 1; i < len; ++i) {
            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
        }
        return arr[len - 1];
    }
}
