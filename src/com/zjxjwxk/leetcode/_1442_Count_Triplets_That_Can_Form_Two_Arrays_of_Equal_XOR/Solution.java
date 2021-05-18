package com.zjxjwxk.leetcode._1442_Count_Triplets_That_Can_Form_Two_Arrays_of_Equal_XOR;

/**
 * 二重循环（遍历异或和为0的区间）
 * @author Xinkang Wu
 * @date 2021/5/18 23:10
 */
public class Solution {

    public int countTriplets(int[] arr) {
        int len = arr.length, ans = 0;
        for (int i = 0; i < len; ++i) {
            int temp = 0;
            for (int j = i; j < len; ++j) {
                temp ^= arr[j];
                if (temp == 0) {
                    ans += j - i;
                }
            }
        }
        return ans;
    }
}
