package com.zjxjwxk.leetcode._1720_Decode_XORed_Array;

/**
 * 位运算
 * @author Xinkang Wu
 * @date 2021/5/6 20:52
 */
public class Solution {

    public int[] decode(int[] encoded, int first) {
        int len = encoded.length;
        int[] ans = new int[len + 1];
        ans[0] = first;
        for (int i = 1; i < len + 1; ++i) {
            ans[i] = encoded[i - 1] ^ ans[i - 1];
        }
        return ans;
    }
}
