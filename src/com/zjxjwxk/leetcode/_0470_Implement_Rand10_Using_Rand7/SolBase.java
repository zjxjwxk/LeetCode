package com.zjxjwxk.leetcode._0470_Implement_Rand10_Using_Rand7;

/**
 * @author Xinkang Wu
 * @date 2021/9/6 09:41
 */
public class SolBase {

    public int rand7() {
        double random = Math.random() * 6 + 1;
        return (int) (random + 0.5);
    }

    public static void main(String[] args) {
        SolBase solBase = new SolBase();
        System.out.println(solBase.rand7());
        System.out.println(solBase.rand7());
        System.out.println(solBase.rand7());
        System.out.println(solBase.rand7());
        System.out.println(solBase.rand7());
    }
}
