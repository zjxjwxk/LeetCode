package com.zjxjwxk.leetcode._0659_Split_Array_into_Consecutive_Subsequences;

import java.util.HashMap;
import java.util.Map;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2020/12/7 23:03
 */
public class Solution2 {

    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> endMap = new HashMap<>();
        for (int num : nums) {
            countMap.merge(num, 1, Integer::sum);
        }
        for (int num : nums) {
            int count1 = countMap.get(num);
            if (count1 != 0) {
                Integer endCount = endMap.get(num - 1);
                if (endCount != null && endCount != 0) {
                    countMap.put(num, count1 - 1);
                    endMap.put(num - 1, endCount - 1);
                    endMap.merge(num, 1, Integer::sum);
                } else {
                    Integer count2 = countMap.get(num + 1), count3 = countMap.get(num + 2);
                    if (count2 != null && count3 != null && countMap.get(num + 1) != 0 && countMap.get(num + 2) != 0) {
                        countMap.put(num, count1 - 1);
                        countMap.put(num + 1, count2 - 1);
                        countMap.put(num + 2, count3 - 1);
                        endMap.merge(num + 2, 1, Integer::sum);
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
