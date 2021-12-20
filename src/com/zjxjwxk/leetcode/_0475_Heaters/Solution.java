package com.zjxjwxk.leetcode._0475_Heaters;

import java.util.Arrays;

/**
 * 二分搜索半径+双指针
 * @author Xinkang Wu
 * @date 2021/12/20 13:07
 */
public class Solution {

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int max = 0, houseLen = houses.length, heaterLen = heaters.length;
        for (int house : houses) {
            max = Math.max(max, house);
        }
        for (int heater : heaters) {
            max = Math.max(max, heater);
        }
        int left = 0, right = max, radius;
        while (left <= right) {
            radius = left + ((right - left) >> 1);
            int i = 0, j = 0;
            while (i < houseLen && j < heaterLen) {
                while (j < heaterLen && Math.abs(houses[i] - heaters[j]) > radius) {
                    ++j;
                }
                ++i;
            }
            if (j < heaterLen) {
                right = radius - 1;
            } else {
                left = radius + 1;
            }
        }
        return left;
    }
}
