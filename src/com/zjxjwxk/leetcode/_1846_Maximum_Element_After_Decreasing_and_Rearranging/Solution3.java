package com.zjxjwxk.leetcode._1846_Maximum_Element_After_Decreasing_and_Rearranging;

/**
 * 计数排序+贪心
 * 时间复杂度O(n)
 * 空间复杂度O(n)
 * @author Xinkang Wu
 * @date 2021/7/15 09:20
 */
public class Solution3 {

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int len = arr.length, miss = 0;
        int[] counts = new int[len + 1];
        for (int num : arr) {
            ++counts[Math.min(num, len)];
        }
        for (int i = 1; i <= len; ++i) {
            if (counts[i] == 0) {
                ++miss;
            } else {
                miss = Math.max(miss - counts[i] + 1, 0);
            }
        }
        return len - miss;
    }
}
