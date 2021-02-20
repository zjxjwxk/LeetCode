package com.zjxjwxk.leetcode._0697_Degree_of_an_Array;

import java.util.HashMap;
import java.util.Map;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/2/20 13:30
 */
public class Solution {

    public int findShortestSubArray(int[] nums) {
        int len = nums.length, maxCount = 0, ans = len;
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < len; ++i) {
            int[] arr = map.get(nums[i]);
            if (arr == null) {
                map.put(nums[i], new int[]{1, i, i});
            } else {
                ++arr[0];
                arr[2] = i;
            }
        }
        for (int[] arr : map.values()) {
            if (arr[0] > maxCount) {
                maxCount = arr[0];
                ans = arr[2] - arr[1] + 1;
            } else if (arr[0] == maxCount) {
                ans = Math.min(ans, arr[2] - arr[1] + 1);
            }
        }
        return ans;
    }
}
