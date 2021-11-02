package com.zjxjwxk.leetcode._0335_Self_Crossing;

/**
 * 归纳法
 * @author Xinkang Wu
 * @date 2021/10/29 14:38
 */
public class Solution {

    public boolean isSelfCrossing(int[] distance) {
        int n = distance.length;
        for (int i = 3; i < n; ++i) {
            if (distance[i - 1] <= distance[i - 3] && distance[i] >= distance[i - 2]) {
                return true;
            }
            if (i == 4 && distance[3] == distance[1] && distance[4] >= (distance[2] - distance[0])) {
                return true;
            }
            if (i >= 5 && distance[i - 2] > distance[i - 4] && distance[i - 1] >= (distance[i - 3] - distance[i - 5]) && distance[i - 1] <= distance[i - 3] && distance[i] >= (distance[i - 2] - distance[i - 4])) {
                return true;
            }
        }
        return false;
    }
}
