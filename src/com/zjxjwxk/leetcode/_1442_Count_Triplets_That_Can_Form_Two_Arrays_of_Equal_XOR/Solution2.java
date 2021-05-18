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
        int len = arr.length, ans = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> sumMap = new HashMap<>();
        int[] s = new int[len + 1];
        for (int i = 1; i <= len; ++i) {
            s[i] = s[i - 1] ^ arr[i - 1];
        }
        for (int k = 0; k < len; ++k) {
            if (countMap.containsKey(s[k + 1])) {
                ans += countMap.get(s[k + 1]) * k - sumMap.get(s[k + 1]);
            }
            countMap.merge(s[k], 1, Integer::sum);
            sumMap.merge(s[k], k, Integer::sum);
        }
        return ans;
    }
}
