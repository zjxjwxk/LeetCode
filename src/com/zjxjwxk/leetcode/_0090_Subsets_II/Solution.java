package com.zjxjwxk.leetcode._0090_Subsets_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 递归剪枝
 * @author Xinkang Wu
 * @date 2021/4/4 17:13
 */
public class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums, 0, true, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(int[] nums, int index, boolean choosePre, List<Integer> cur, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        if (choosePre || index > 0 && nums[index] != nums[index - 1]) {
            cur.add(nums[index]);
            dfs(nums, index + 1, true, cur, ans);
            cur.remove(cur.size() - 1);
        }
        dfs(nums, index + 1, false, cur, ans);
    }
}
