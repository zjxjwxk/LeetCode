package com.zjxjwxk.leetcode._0047_Permutations_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 回溯
 * @author Xinkang Wu
 * @date 2021/10/28 20:30
 */
public class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] vis = new boolean[nums.length];
        backtrack(nums, cur, 0, vis, ans);
        return ans;
    }

    private void backtrack(int[] nums, List<Integer> cur, int index, boolean[] vis, List<List<Integer>> ans) {
        int len = nums.length;
        if (index == len) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < len; ++i) {
            if (vis[i] || i > 0 && nums[i] == nums[i - 1] && !vis[i - 1]) {
                continue;
            }
            cur.add(nums[i]);
            vis[i] = true;
            backtrack(nums, cur, index + 1, vis, ans);
            cur.remove(index);
            vis[i] = false;
        }
    }
}
