package com.zjxjwxk.leetcode._1005_Maximize_Sum_Of_Array_After_K_Negations;

import java.util.HashMap;
import java.util.Map;

/**
 * 计数排序+从小到大修改每个负数
 * 时间复杂度O(n+C)
 * 空间复杂度O(C)
 * @author Xinkang Wu
 * @date 2021/12/3 14:47
 */
public class Solution2 {

    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.merge(num, 1, Integer::sum);
            sum += num;
        }
        for (int i = -100; i < 0; ++i) {
            Integer count = countMap.get(i);
            if (count != null) {
                if (count <= k) {
                    sum -= (i << 1) * count;
                    k -= count;
                    countMap.merge(-i, 1, Integer::sum);
                } else {
                    return sum - (i << 1) * k;
                }
            }
        }
        if ((k & 1) == 1 && !countMap.containsKey(0)) {
            for (int i = 1; i <= 100; ++i) {
                Integer count = countMap.get(i);
                if (count != null) {
                    return sum - (i << 1);
                }
            }
        }
        return sum;
    }
}
