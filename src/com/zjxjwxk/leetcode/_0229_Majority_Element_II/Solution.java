package com.zjxjwxk.leetcode._0229_Majority_Element_II;

import java.util.ArrayList;
import java.util.List;

/**
 * 摩尔投票法
 * @author Xinkang Wu
 * @date 2021/10/22 13:32
 */
public class Solution {

    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length, num1 = 0, vote1 = 0, num2 = 0, vote2 = 0;
        for (int num : nums) {
            if (vote1 > 0 && num == num1) {
                ++vote1;
            } else if (vote2 > 0 && num == num2) {
                ++vote2;
            } else if (vote1 == 0) {
                num1 = num;
                vote1 = 1;
            } else if (vote2 == 0) {
                num2 = num;
                vote2 = 1;
            } else {
                --vote1;
                --vote2;
            }
        }
        int count1 = 0, count2 = 0;
        for (int num : nums) {
            if (vote1 > 0 && num == num1) {
                ++count1;
            }
            if (vote2 > 0 && num == num2) {
                ++count2;
            }
        }
        List<Integer> ans = new ArrayList<>();
        if (count1 > len / 3) {
            ans.add(num1);
        }
        if (count2 > len / 3) {
            ans.add(num2);
        }
        return ans;
    }
}
