package com.zjxjwxk.leetcode._0274_H_Index;

import java.util.Arrays;

/**
 * 排序
 * @author Xinkang Wu
 * @date 2021/7/11 20:59
 */
public class Solution {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length, i = len - 1;
        while (i >= 0 && (len - i) <= citations[i]) {
            --i;
        }
        return len - i - 1;
    }
}
