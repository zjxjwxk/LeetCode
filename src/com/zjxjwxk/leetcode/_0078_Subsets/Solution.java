package com.zjxjwxk.leetcode._0078_Subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2025/7/28 21:40
 */
public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, 0, ans);
        return ans;
    }

    private void backtrack(List<Integer> numList, int[] nums, int index, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(numList));
            return;
        }
        numList.add(nums[index]);
        backtrack(numList, nums, index + 1, ans);
        numList.remove(numList.size() - 1);
        backtrack(numList, nums, index + 1, ans);
    }
}
