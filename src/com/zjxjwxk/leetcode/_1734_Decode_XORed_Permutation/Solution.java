package com.zjxjwxk.leetcode._1734_Decode_XORed_Permutation;

/**
 * 利用异或运算解码
 * @author Xinkang Wu
 * @date 2021/5/12 23:55
 */
public class Solution {

    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int total = 0;
        for (int i = 1; i <= n; ++i) {
            total ^= i;
        }
        int odd = 0;
        for (int i = 1; i < n - 1; i += 2) {
            odd ^= encoded[i];
        }
        int[] ans = new int[n];
        ans[0] = total ^ odd;
        for (int i = 1; i < n; ++i) {
            ans[i] = ans[i - 1] ^ encoded[i - 1];
        }
        return ans;
    }
}
