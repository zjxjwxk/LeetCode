package com.zjxjwxk.leetcode._0575_Distribute_Candies;

import java.util.HashSet;
import java.util.Set;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2021/11/1 21:29
 */
public class Solution {

    public int distributeCandies(int[] candyType) {
        Set<Integer> typeSet = new HashSet<>();
        for (int type : candyType) {
            typeSet.add(type);
        }
        return Math.min(candyType.length >> 1, typeSet.size());
    }
}
