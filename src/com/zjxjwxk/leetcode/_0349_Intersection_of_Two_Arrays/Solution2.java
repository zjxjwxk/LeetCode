package com.zjxjwxk.leetcode._0349_Intersection_of_Two_Arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Xinkang Wu
 * @date 2020/11/2 10:29 上午
 */
public class Solution2 {

    public int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length, index = 0;
        Set<Integer> set = new HashSet<>(len1);
        Set<Integer> ansSet = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                ansSet.add(num);
            }
        }
        int[] ans = new int[ansSet.size()];
        for (int num : ansSet) {
            ans[index++] = num;
        }
        return ans;
    }
}
