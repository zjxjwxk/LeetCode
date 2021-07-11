package com.zjxjwxk.leetcode._0274_H_Index;

/**
 * 计数排序
 * @author Xinkang Wu
 * @date 2021/7/11 20:59
 */
public class Solution2 {

    public int hIndex(int[] citations) {
        int len = citations.length, ans = 0;
        int[] counts = new int[len + 1];
        for (int citation : citations) {
            ++counts[Math.min(citation, len)];
        }
        for (int i = len; i >= 0 && ans <= i; --i) {
            if (counts[i] > 0) {
                ans = Math.min(ans + counts[i], i);
            }
        }
        return ans;
    }
}
