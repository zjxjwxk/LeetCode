package com.zjxjwxk.leetcode._0442_Find_All_Duplicates_in_an_Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 交换
 *
 * @author Xinkang Wu
 * @date 2025/11/15 14:56
 */
public class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            while (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] - 1 != i) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
