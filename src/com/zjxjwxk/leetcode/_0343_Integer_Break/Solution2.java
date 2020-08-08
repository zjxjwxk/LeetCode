package com.zjxjwxk.leetcode._0343_Integer_Break;

/**
 * @author zjxjwxk
 * @date 2020/8/9 12:31 上午
 */
public class Solution2 {

    public static int integerBreak(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        }
        int timesOf3 = n / 3;
        if ((n - timesOf3 * 3) == 1) {
            --timesOf3;
        }
        int timesOf2 = (n - timesOf3 * 3) / 2;
        return (int) (Math.pow(3, timesOf3) * Math.pow(2, timesOf2));
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(5));
    }
}
