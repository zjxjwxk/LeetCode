package com.zjxjwxk.leetcode._1488_Avoid_Flood_in_The_City;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * 有序集合+二分查找
 *
 * @author Xinkang Wu
 * @date 2025/10/8 01:39
 */
public class Solution {

    public int[] avoidFlood(int[] rains) {
        int dayLen = rains.length;
        int[] ans = new int[dayLen];
        TreeSet<Integer> sunSet = new TreeSet<>();
        Map<Integer, Integer> rainIndexMap = new HashMap<>();
        for (int i = 0; i < dayLen; ++i) {
            int rain = rains[i];
            if (rain == 0) {
                ans[i] = 1;
                sunSet.add(i);
            } else {
                ans[i] = -1;
                Integer preRainIndex = rainIndexMap.get(rain);
                if (preRainIndex != null) {
                    Integer sunIndex = sunSet.ceiling(preRainIndex);
                    if (sunIndex == null) {
                        return new int[]{};
                    } else {
                        sunSet.remove(sunIndex);
                        ans[sunIndex] = rain;
                    }
                }
                rainIndexMap.put(rain, i);
            }
        }
        return ans;
    }
}
