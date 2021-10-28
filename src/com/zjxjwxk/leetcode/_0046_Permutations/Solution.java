package com.zjxjwxk.leetcode._0046_Permutations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 回溯
 * @author Xinkang Wu
 * @date 2021/10/28 14:30
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        for (int num : nums) {
            cur.add(num);
        }
        backtrack(nums, 0, cur, ans);
        return ans;
    }

    private void backtrack(int[] nums, int index, List<Integer> cur, List<List<Integer>> ans) {
        int len = nums.length;
        if (index == len) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (int i = index; i < len; ++i) {
            Collections.swap(cur, i, index);
            backtrack(nums, index + 1, cur, ans);
            Collections.swap(cur, i, index);
        }
    }
}
