package com.zjxjwxk.leetcode._0217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Xinkang Wu
 * @date 2020/12/13 21:10
 */
public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
