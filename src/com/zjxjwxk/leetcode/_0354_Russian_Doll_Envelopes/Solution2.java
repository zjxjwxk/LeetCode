package com.zjxjwxk.leetcode._0354_Russian_Doll_Envelopes;

import java.util.Arrays;

/**
 * 动态规划+二分查找
 * @author Xinkang Wu
 * @date 2021/3/4 15:10
 */
public class Solution2 {

    public int maxEnvelopes(int[][] envelopes) {
        int len = envelopes.length;
        Arrays.sort(envelopes, (envelope1, envelope2) -> {
            if (envelope1[0] != envelope2[0]) {
                return envelope1[0] - envelope2[0];
            } else {
                return envelope2[1] - envelope1[1];
            }
        });
        int[] d = new int[len + 1];
        d[0] = envelopes[0][1];
        int maxLen = 1;
        for (int i = 1; i < len; ++i) {
            if (envelopes[i][1] > d[maxLen - 1]) {
                d[maxLen++] = envelopes[i][1];
            } else {
                d[binarySearch(d, 0, maxLen, envelopes[i][1])] = envelopes[i][1];
            }
        }
        return maxLen;
    }

    private int binarySearch(int[] d, int left, int right, int num) {
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (num <= d[mid]) {
                right = mid - 1;
            } else if (num > d[mid]) {
                left = mid + 1;
            }
        }
        return left;
    }
}
