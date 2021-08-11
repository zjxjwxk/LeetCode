package com.zjxjwxk.leetcode._1713_Minimum_Operations_to_Make_a_Subsequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 贪心+二分
 * @author Xinkang Wu
 * @date 2021/8/3 16:43
 */
public class Solution {

    public int minOperations(int[] target, int[] arr) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < target.length; ++i) {
            indexMap.put(target[i], i);
        }
        List<Integer> d = new ArrayList<>();
        for (int num : arr) {
            Integer index = indexMap.get(num);
            if (index != null) {
                int largerIndex = findLargerIndex(d, index);
                if (largerIndex == d.size()) {
                    d.add(index);
                } else {
                    d.set(largerIndex, index);
                }
            }
        }
        return target.length - d.size();
    }

    private int findLargerIndex(List<Integer> d, int target) {
        int left = 0, right = d.size() - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (d.get(mid) < target) {
                left = mid + 1;
            } else if (d.get(mid) > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}
