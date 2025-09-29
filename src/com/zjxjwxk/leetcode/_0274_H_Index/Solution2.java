package com.zjxjwxk.leetcode._0274_H_Index;

/**
 * 计数排序
 * @author Xinkang Wu
 * @date 2021/7/11 20:59
 */
public class Solution2 {

    public int hIndex(int[] citations) {
        int n = citations.length, count = 0;
        int[] counts = new int[n + 1];
        for (int citation : citations) {
            ++counts[Math.min(citation, n)];
        }
        for (int citation = n; citation >= 1; --citation) {
            count += counts[citation];
            if (count >= citation) {
                return citation;
            }
        }
        return 0;
    }
}
