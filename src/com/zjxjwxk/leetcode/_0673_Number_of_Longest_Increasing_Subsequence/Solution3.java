package com.zjxjwxk.leetcode._0673_Number_of_Longest_Increasing_Subsequence;

import java.util.ArrayList;
import java.util.List;

/**
 * 贪心 + 前缀和 + 二分搜索
 * @author Xinkang Wu
 * @date 2022/7/30 21:47
 */
public class Solution3 {

    public int findNumberOfLIS(int[] nums) {
        int len = nums.length, maxLen = 1;
        List<List<Integer>> minNumListOfLen = new ArrayList<>(len + 1);
        List<List<Integer>> countPreSumListOfLen = new ArrayList<>(len + 1);
        for (int i = 0; i <= len; ++i) {
            minNumListOfLen.add(new ArrayList<>());
            List<Integer> countPreSumList = new ArrayList<>();
            countPreSumList.add(0);
            countPreSumListOfLen.add(countPreSumList);
        }
        minNumListOfLen.get(1).add(nums[0]);
        countPreSumListOfLen.get(0).add(1);
        countPreSumListOfLen.get(1).add(1);
        for (int i = 1; i < len; ++i) {
            // Add to minNumListOfLen
            int num = nums[i];
            int minNumListIndex = binarySearchMinNumListIndex(minNumListOfLen, 1, maxLen, num);
            minNumListOfLen.get(minNumListIndex).add(num);
            maxLen = Math.max(maxLen, minNumListIndex);

            // Add to countPreSumListOfLen
            List<Integer> preMinNumList = minNumListOfLen.get(minNumListIndex - 1);
            int minNumIndex = binarySearchMinNumIndex(preMinNumList, 0, preMinNumList.size() - 1, num);
            List<Integer> countPreSumList =  countPreSumListOfLen.get(minNumListIndex);
            List<Integer> preCountPreSumList = countPreSumListOfLen.get(minNumListIndex - 1);
            int preCount = preCountPreSumList.get(preCountPreSumList.size() - 1) - preCountPreSumList.get(minNumIndex);
            countPreSumList.add(preCount + countPreSumList.get(countPreSumList.size() - 1));
        }
        List<Integer> countPreSumList = countPreSumListOfLen.get(maxLen);
        return countPreSumList.get(countPreSumList.size() - 1);
    }

    private int binarySearchMinNumListIndex(List<List<Integer>> minNumListOfLen, int left, int right, int num) {
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            List<Integer> minNumList = minNumListOfLen.get(mid);
            Integer minNum = minNumList.get(minNumList.size() - 1);
            if (minNum < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private int binarySearchMinNumIndex(List<Integer> minNumList, int left, int right, int num) {
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            Integer minNum = minNumList.get(mid);
            if (minNum >= num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
