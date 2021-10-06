package com.zjxjwxk.leetcode._0414_Third_Maximum_Number;

import java.util.TreeSet;

/**
 * 有序集合
 * @author Xinkang Wu
 * @date 2021/10/6 12:18
 */
public class Solution {

    public int thirdMax(int[] nums) {
        TreeSet<Integer> maxSet = new TreeSet<>();
        for (int num : nums) {
            if (!maxSet.contains(num)) {
                if (maxSet.size() < 3) {
                    maxSet.add(num);
                } else if (num > maxSet.first()) {
                    maxSet.remove(maxSet.first());
                    maxSet.add(num);
                }
            }
        }
        return maxSet.size() < 3 ? maxSet.last() : maxSet.first();
    }
}
