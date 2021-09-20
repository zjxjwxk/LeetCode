package com.zjxjwxk.leetcode._0673_Number_of_Longest_Increasing_Subsequence;

import java.util.ArrayList;
import java.util.List;

/**
 * 贪心 + 前缀和 + 二分查找
 * @author Xinkang Wu
 * @date 2021/9/20 14:55
 */
public class Solution2 {

    public int findNumberOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        List<List<Integer>> d = new ArrayList<>();
        List<List<Integer>> countPreSumLists = new ArrayList<>();
        for (int num : nums) {
            int dIndex = binarySearch1(d, num);
            int addCount = 1;
            if (dIndex > 0) {
                int countIndex = binarySearch2(d.get(dIndex - 1), num);
                addCount = countPreSumLists.get(dIndex - 1).get(countPreSumLists.get(dIndex - 1).size() - 1) - countPreSumLists.get(dIndex - 1).get(countIndex);
            }
            if (dIndex == d.size()) {
                List<Integer> dList = new ArrayList<>();
                dList.add(num);
                d.add(dList);
                List<Integer> countPreSumList = new ArrayList<>();
                countPreSumList.add(0);
                countPreSumList.add(addCount);
                countPreSumLists.add(countPreSumList);
            } else {
                d.get(dIndex).add(num);
                countPreSumLists.get(dIndex).add(countPreSumLists.get(dIndex).get(countPreSumLists.get(dIndex).size() - 1) + addCount);
            }
        }
        int size1 = countPreSumLists.size(), size2 = countPreSumLists.get(size1 - 1).size();
        return countPreSumLists.get(size1 - 1).get(size2 - 1);
    }

    private int binarySearch1(List<List<Integer>> dp, int target) {
        int left = 0, right = dp.size() - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            int midNum = dp.get(mid).get(dp.get(mid).size() - 1);
            if (midNum < target) {
                left = mid + 1;
            } else if (midNum > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    private int binarySearch2(List<Integer> list, int target) {
        int left = 0, right = list.size() - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            int midNum = list.get(mid);
            if (midNum >= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
