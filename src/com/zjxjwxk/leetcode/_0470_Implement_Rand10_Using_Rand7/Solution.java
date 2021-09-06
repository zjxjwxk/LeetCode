package com.zjxjwxk.leetcode._0470_Implement_Rand10_Using_Rand7;

/**
 * 拒绝采样
 * @author Xinkang Wu
 * @date 2021/9/5 22:04
 */
public class Solution extends SolBase {

    public int rand10() {
        int row, col, index;
        do {
            row = rand7();
            col = rand7();
            index = (row - 1) * 7 + col;
        } while (index > 40);
        return (index - 1) % 10 + 1;
    }
}
