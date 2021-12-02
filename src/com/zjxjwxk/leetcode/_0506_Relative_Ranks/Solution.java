package com.zjxjwxk.leetcode._0506_Relative_Ranks;

import java.util.Arrays;

/**
 * 排序
 * @author Xinkang Wu
 * @date 2021/12/2 15:39
 */
public class Solution {

    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        Integer[] indexes = new Integer[len];
        for (int i = 0; i < len; ++i) {
            indexes[i] = i;
        }
        Arrays.sort(indexes, (index1, index2) -> score[index2] - score[index1]);
        String[] ans = new String[len];
        for (int rank = 0; rank < len; ++rank) {
            int index = indexes[rank];
            switch (rank) {
                case 0:
                    ans[index] = "Gold Medal";
                    break;
                case 1:
                    ans[index] = "Silver Medal";
                    break;
                case 2:
                    ans[index] = "Bronze Medal";
                    break;
                default:
                    ans[index] = String.valueOf(rank + 1);
            }
        }
        return ans;
    }
}
