package com.zjxjwxk.leetcode._0846_Hand_of_Straights;

import java.util.Map;
import java.util.TreeMap;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2021/12/30 12:51
 */
public class Solution {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int num : hand) {
            countMap.merge(num, 1, Integer::sum);
        }
        while (countMap.size() >= groupSize) {
            Map.Entry<Integer, Integer> firstEntry = countMap.firstEntry();
            int firstNum = firstEntry.getKey();
            int firstCount = firstEntry.getValue();
            if (firstCount == 1) {
                countMap.remove(firstNum);
            } else {
                countMap.put(firstNum, firstCount - 1);
            }
            for (int i = firstNum + 1; i < firstNum + groupSize; ++i) {
                int count = countMap.getOrDefault(i, 0);
                if (count == 0) {
                    return false;
                } else if (count == 1) {
                    countMap.remove(i);
                } else {
                    countMap.put(i, count - 1);
                }
            }
        }
        return countMap.isEmpty();
    }
}
