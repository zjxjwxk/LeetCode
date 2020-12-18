package com.zjxjwxk.leetcode._0136_Single_Number;

/**
 * 位运算
 * @author Xinkang Wu
 * @date 2020/12/18 21:48
 */
public class Solution {

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
