package com.zjxjwxk.leetcode._0456_132_Pattern;

import java.util.*;

/**
 * 枚举3
 * 时间复杂度O(nlogn)
 * @author Xinkang Wu
 * @date 2021/3/25 00:17
 */
public class Solution {

    public boolean find132pattern(int[] nums) {
        int len = nums.length, iNum = nums[0];
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int i = 1; i < len; ++i) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }
        for (int j = 1; j < len - 1; ++j) {
            int count = countMap.get(nums[j]);
            countMap.put(nums[j], count - 1);
            if (count == 1) {
                countMap.remove(nums[j]);
            }
            if (nums[j] > iNum) {
                Integer kNum = countMap.ceilingKey(iNum + 1);
                if (kNum != null && kNum < nums[j]) {
                    return true;
                }
            }
            iNum = Math.min(iNum, nums[j]);
        }
        return false;
    }
}
