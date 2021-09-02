package com.zjxjwxk.leetcode._1137_N_th_Tribonacci_Number;

/**
 * 动态规划
 * @author Xinkang Wu
 * @date 2021/9/2 17:01
 */
public class Solution {

    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int t0 = 0, t1 = 1, t2 = 1;
        while ((n--) != 2) {
            int t3 = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }
        return t2;
    }
}
