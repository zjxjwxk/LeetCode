package com.zjxjwxk.leetcode._0134_Gas_Station;

/**
 * 一次遍历
 * @author Xinkang Wu
 * @date 2020/11/18 12:14
 */
public class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i = 0, len = gas.length;
        while (i < len) {
            int gasSum = 0, costSum = 0, cnt = 0;
            while (cnt < len) {
                int j = (i + cnt) % len;
                gasSum += gas[j];
                costSum += cost[j];
                if (gasSum < costSum) {
                    break;
                }
                ++cnt;
            }
            if (cnt == len) {
                return i;
            } else {
                i = i + cnt + 1;
            }
        }
        return -1;
    }
}
