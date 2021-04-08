package com.zjxjwxk.leetcode._0781_Rabbits_in_Forest;

import java.util.HashMap;
import java.util.Map;

/**
 * 贪心1
 * @author Xinkang Wu
 * @date 2021/4/8 23:04
 */
public class Solution {

    public int numRabbits(int[] answers) {
        Map<Integer, Integer> countMap = new HashMap<>(answers.length);
        for (int answer : answers) {
            countMap.merge(answer, 1, Integer::sum);
        }
        int other = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int k = entry.getKey(), v = entry.getValue();
            int remain = v % (k + 1);
            if (remain > 0) {
                other += k + 1 - remain;
            }
        }
        return answers.length + other;
    }
}
