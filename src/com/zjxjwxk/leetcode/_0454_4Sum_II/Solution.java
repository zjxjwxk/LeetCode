package com.zjxjwxk.leetcode._0454_4Sum_II;

import java.util.HashMap;
import java.util.Map;

/**
 * 分组+哈希表
 * @author Xinkang Wu
 * @date 2020/11/27 11:00
 */
public class Solution {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num1 : A) {
            for (int num2 : B) {
                map.merge(num1 + num2, 1, Integer::sum);
            }
        }
        int ans = 0;
        for (int num1 : C) {
            for (int num2 : D) {
                Integer count = map.get(-(num1 + num2));
                if (count != null) {
                    ans += count;
                }
            }
        }
        return ans;
    }
}
