package com.zjxjwxk.leetcode._0888_Fair_Candy_Swap;

import java.util.HashSet;
import java.util.Set;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/2/1 11:15
 */
public class Solution {

    public int[] fairCandySwap(int[] A, int[] B) {
        int sum1 = 0, sum2 = 0;
        Set<Integer> aSet = new HashSet<>();
        for (int a : A) {
            sum1 += a;
            aSet.add(a);
        }
        for (int b : B) {
            sum2 += b;
        }
        int diff = (sum1 - sum2) >> 1;
        for (int b : B) {
            if (aSet.contains(b + diff)) {
                return new int[]{b + diff, b};
            }
        }
        return new int[2];
    }
}
