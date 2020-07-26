package com.zjxjwxk.leetcode._0070_Climbing_Stairs;

/**
 * 直接迭代
 * 并用仅两个变量减少空间复杂度
 * @author zjxjwxk
 */
public class Solution2 {

    public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        while (--n > 0) {
            b += a;
            a = b - a;
        }
        return b;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.climbStairs(44));
    }
}

