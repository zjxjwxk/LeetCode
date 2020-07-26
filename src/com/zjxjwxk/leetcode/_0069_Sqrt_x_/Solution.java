package com.zjxjwxk.leetcode._0069_Sqrt_x_;

/**
 * 牛顿迭代法
 * @author zjxjwxk
 */
public class Solution {

    public int mySqrt(int x) {
        long n = x;
        while (n * n > x) {
            n = (n + x / n) / 2;
        }
        return (int) n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(27));
    }
}
