package com.zjxjwxk.leetcode._1846_Maximum_Element_After_Decreasing_and_Rearranging;

/**
 * 计数排序+贪心
 * 时间复杂度O(n)
 * 空间复杂度O(n)
 * @author Xinkang Wu
 * @date 2021/7/15 09:20
 */
public class Solution2 {

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int len = arr.length, index = 0;
        int[] counts = new int[len + 1];
        for (int num : arr) {
            ++counts[Math.min(num, len)];
        }
        int[] sorted = new int[len];
        for (int i = 1; i <= len; ++i) {
            for (int j = 0; j < counts[i]; ++j) {
                sorted[index++] = i;
            }
        }
        sorted[0] = 1;
        for (int i = 1; i < len; ++i) {
            sorted[i] = Math.min(sorted[i], sorted[i - 1] + 1);
        }
        return sorted[len - 1];
    }
}
