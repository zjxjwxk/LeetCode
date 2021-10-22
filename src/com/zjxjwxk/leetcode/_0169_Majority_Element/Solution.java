package com.zjxjwxk.leetcode._0169_Majority_Element;

/**
 * Boyer-Moore 投票算法
 * @author Xinkang Wu
 * @date 2021/10/22 10:43
 */
public class Solution {

    public int majorityElement(int[] nums) {
        int ans = 0, count = 0;
        for (int num : nums) {
            if (count == 0) {
                ans = num;
                count = 1;
            } else {
                if (num == ans) {
                    ++count;
                } else {
                    --count;
                }
            }
        }
        return ans;
    }
}
