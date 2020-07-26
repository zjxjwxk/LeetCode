package com.zjxjwxk.leetcode._509_Fibonacci_Number;

/**
 * @author zjxjwxk
 * @date 2020/7/26 11:53 下午
 */
public class Solution {
    public static int fib(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        }
        int fibN = 0, fibA = 0, fibB = 1;
        for (int i = 2; i <= N; ++i) {
            fibN = fibA + fibB;
            fibA = fibB;
            fibB = fibN;
        }
        return fibN;
    }

    public static void main(String[] args) {
        System.out.println(fib(45));
    }
}
