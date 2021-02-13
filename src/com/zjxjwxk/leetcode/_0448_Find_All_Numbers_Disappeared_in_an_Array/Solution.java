package com.zjxjwxk.leetcode._0448_Find_All_Numbers_Disappeared_in_an_Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 原地修改
 * @author Xinkang Wu
 * @date 2021/2/14 01:01
 */
public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < len; ++i) {
            int index = (nums[i] - 1) % len;
            nums[index] += len;
        }
        for (int i = 0; i < len; ++i) {
            if (nums[i] <= len) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}
