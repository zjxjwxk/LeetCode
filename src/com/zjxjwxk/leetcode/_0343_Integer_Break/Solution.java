package com.zjxjwxk.leetcode._0343_Integer_Break;

/**
 * @author zjxjwxk
 * @date 2020/8/9 12:31 上午
 */
public class Solution {

    public static int integerBreak(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        }
        int[] maxProducts = new int[n + 1];
        maxProducts[1] = 1;
        maxProducts[2] = 2;
        maxProducts[3] = 3;
        for (int i = 4; i <= n; ++i) {
            for (int j = 1; j <= i / 2; ++j) {
                int product = maxProducts[j] * maxProducts[i - j];
                if (product > maxProducts[i]) {
                    maxProducts[i] = product;
                }
            }
        }
        return maxProducts[n];
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(5));
    }
}
