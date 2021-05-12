package com.zjxjwxk.leetcode._1310_XOR_Queries_of_a_Subarray;

/**
 * 前缀异或
 * @author Xinkang Wu
 * @date 2021/5/12 23:41
 */
public class Solution {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int aLen = arr.length, qLen = queries.length;
        int[] preXors = new int[aLen + 1];
        for (int i = 1; i <= aLen; ++i) {
            preXors[i] = preXors[i - 1] ^ arr[i - 1];
        }
        int[] ans = new int[qLen];
        for (int i = 0; i < qLen; ++i) {
            ans[i] = preXors[queries[i][1] + 1] ^ preXors[queries[i][0]];
        }
        return ans;
    }
}
