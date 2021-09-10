package com.zjxjwxk.leetcode._1894_Find_the_Student_that_Will_Replace_the_Chalk;

/**
 * @author Xinkang Wu
 * @date 2021/9/10 13:07
 */
public class Solution {

    public int chalkReplacer(int[] chalk, int k) {
        int len = chalk.length;
        long sum = 0;
        for (int c : chalk) {
            sum += c;
        }
        k %= sum;
        for (int i = 0; i < len; ++i) {
            if (k >= chalk[i]) {
                k -= chalk[i];
            } else {
                return i;
            }
        }
        return 0;
    }
}
