package com.zjxjwxk.leetcode._0458_Poor_Pigs;

/**
 * 数学
 * @author Xinkang Wu
 * @date 2021/11/25 13:25
 */
public class Solution {

    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int states = minutesToTest / minutesToDie + 1;
        return (int) Math.ceil(Math.log(buckets) / Math.log(states));
    }
}
