package com.zjxjwxk.leetcode._1006_Clumsy_Factorial;

/**
 * 数学
 * 时间复杂度O(1)
 * 空间复杂度O(1)
 * @author Xinkang Wu
 * @date 2021/4/5 19:35
 */
public class Solution2 {

    public int clumsy(int N) {
        if (N == 1) {
            return 1;
        } else if (N == 2) {
            return 2;
        } else if (N == 3) {
            return 6;
        } else if (N == 4) {
            return 7;
        }
        int remain = N % 4;
        if (remain == 0) {
            return N + 1;
        } else if (remain == 1) {
            return N + 2;
        } else if (remain == 2) {
            return N + 2;
        } else {
            return N - 1;
        }
    }
}
