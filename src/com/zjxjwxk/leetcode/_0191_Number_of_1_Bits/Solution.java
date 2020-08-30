package com.zjxjwxk.leetcode._0191_Number_of_1_Bits;

/**
 * @author Xinkang Wu
 * @date 2020/8/21 12:14 上午
 */
public class Solution {

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
    }
}
