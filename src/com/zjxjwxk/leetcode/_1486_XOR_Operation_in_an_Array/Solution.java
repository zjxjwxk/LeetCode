package com.zjxjwxk.leetcode._1486_XOR_Operation_in_an_Array;

/**
 * 模拟
 * @author Xinkang Wu
 * @date 2021/5/7 21:36
 */
public class Solution {

    public int xorOperation(int n, int start) {
        int ans = start;
        for (int i = 1; i < n; ++i) {
            ans ^= (start + (i << 1));
        }
        return ans;
    }
}
