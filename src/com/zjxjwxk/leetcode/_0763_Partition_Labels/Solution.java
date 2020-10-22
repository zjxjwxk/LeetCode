package com.zjxjwxk.leetcode._0763_Partition_Labels;

import java.util.ArrayList;
import java.util.List;

/**
 * 贪心 + 双指针
 * @author Xinkang Wu
 * @date 2020/10/22 8:19 上午
 */
public class Solution {

    public List<Integer> partitionLabels(String S) {
        int len = S.length(), start = 0, end = 0;
        List<Integer> ans = new ArrayList<>();
        int[] endArr = new int[26];
        for (int i = 0; i < len; ++i) {
            endArr[S.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < len; ++i) {
            end = Math.max(end, endArr[S.charAt(i) - 'a']);
            if (i == end) {
                ans.add(end - start + 1);
                start = end + 1;
            }
        }
        return ans;
    }
}
