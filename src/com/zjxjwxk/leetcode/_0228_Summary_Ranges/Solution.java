package com.zjxjwxk.leetcode._0228_Summary_Ranges;

import java.util.ArrayList;
import java.util.List;

/**
 * 一次遍历
 * @author Xinkang Wu
 * @date 2021/1/10 20:03
 */
public class Solution {

    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        List<String> ans = new ArrayList<>();
        if (len == 0) {
            return ans;
        }
        int left = nums[0];
        for (int i = 0; i < len; ++i) {
            if (i == len - 1 || nums[i] + 1 != nums[i + 1]) {
                if (nums[i] == left) {
                    ans.add(String.valueOf(left));
                } else {
                    ans.add(left + "->" + nums[i]);
                }
                if (i != len - 1) {
                    left = nums[i + 1];
                }
            }
        }
        return ans;
    }
}
