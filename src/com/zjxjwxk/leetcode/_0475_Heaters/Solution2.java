package com.zjxjwxk.leetcode._0475_Heaters;

import java.util.Arrays;

/**
 * 二分搜索每个房子需要的最小半径
 * @author Xinkang Wu
 * @date 2021/12/20 13:07
 */
public class Solution2 {

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int heaterLen = heaters.length, radius = 0;
        for (int house : houses) {
            int left = 0, right = heaterLen - 1, mid;
            while (left <= right) {
                mid = left + ((right - left) >> 1);
                if (heaters[mid] <= house) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (right == -1) {
                radius = Math.max(radius, heaters[right + 1] - house);
            } else if (left == heaterLen) {
                radius = Math.max(radius, house - heaters[right]);
            } else {
                radius = Math.max(radius, Math.min(house - heaters[right], heaters[right + 1] - house));
            }
        }
        return radius;
    }
}
