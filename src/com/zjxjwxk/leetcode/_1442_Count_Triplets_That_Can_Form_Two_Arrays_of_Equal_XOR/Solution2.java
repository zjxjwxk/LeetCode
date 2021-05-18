package com.zjxjwxk.leetcode._1442_Count_Triplets_That_Can_Form_Two_Arrays_of_Equal_XOR;

import java.util.HashMap;
import java.util.Map;

/**
 * 一重循环（哈希表）
 * @author Xinkang Wu
 * @date 2021/5/19 01:11
 */
public class Solution2 {

    public int countTriplets(int[] arr) {
        int len = arr.length, ans = 0, s = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int k = 0; k < len; ++k) {
            if (countMap.containsKey(s ^ arr[k])) {
                ans += countMap.get(s ^ arr[k]) * k - sumMap.get(s ^ arr[k]);
            }
            countMap.merge(s, 1, Integer::sum);
            sumMap.merge(s, k, Integer::sum);
            s ^= arr[k];
        }
        return ans;
    }
}
