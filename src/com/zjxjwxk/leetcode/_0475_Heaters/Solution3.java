package com.zjxjwxk.leetcode._0475_Heaters;

import java.util.Arrays;

/**
 * 排序+双指针
 * @author Xinkang Wu
 * @date 2021/12/20 13:07
 */
public class Solution3 {

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int heaterLen = heaters.length, j = 0, radius = 0;
        for (int house : houses) {
            while (j < heaterLen - 1 && Math.abs(heaters[j] - house) >= Math.abs(heaters[j + 1] - house)) {
                ++j;
            }
            radius = Math.max(radius, Math.abs(heaters[j] - house));
        }
        return radius;
    }
}
