package com.zjxjwxk.leetcode._0561_Array_Partition_I;

import java.util.Arrays;

/**
 * 排序
 * @author Xinkang Wu
 * @date 2021/2/16 11:59
 */
public class Solution {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i += 2) {
            ans += nums[i];
        }
        return ans;
    }
}
