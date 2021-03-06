package com.zjxjwxk.leetcode._0496_Next_Greater_Element_I;

import java.util.HashMap;
import java.util.Map;

/**
 * 单调栈
 * @author Xinkang Wu
 * @date 2021/3/6 14:30
 */
public class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length, index = -1;
        Map<Integer, Integer> nextMap = new HashMap<>(len1);
        int[] stack = new int[len2], ans = new int[len1];
        for (int num : nums2) {
            while (index >= 0 && num > stack[index]) {
                nextMap.put(stack[index--], num);
            }
            stack[++index] = num;
        }
        for (int i = 0; i < len1; ++i) {
            Integer next = nextMap.get(nums1[i]);
            ans[i] = next == null ? -1 : next;
        }
        return ans;
    }
}
