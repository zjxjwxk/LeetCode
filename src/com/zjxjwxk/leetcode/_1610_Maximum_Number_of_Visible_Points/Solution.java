package com.zjxjwxk.leetcode._1610_Maximum_Number_of_Visible_Points;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 滑动窗口
 * @author Xinkang Wu
 * @date 2021/12/16 14:01
 */
public class Solution {

    public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
        int startCount = 0, count = 0;
        List<Double> radianAngleList = new ArrayList<>();
        for (List<Integer> point : points) {
            int x = location.get(0), y = location.get(1);
            int px = point.get(0), py = point.get(1);
            if (px == x && py == y) {
                ++startCount;
            } else {
                radianAngleList.add(Math.atan2(py - y, px - x));
            }
        }
        Collections.sort(radianAngleList);
        int n = radianAngleList.size();
        for (int i = 0; i < n; ++i) {
            radianAngleList.add(radianAngleList.get(i) + Math.PI * 2);
        }
        double radianAngle = Math.toRadians(angle);
        int i = 0, j = 0;
        while (i < n) {
            while (j < radianAngleList.size() && (radianAngleList.get(j) - radianAngleList.get(i) <= radianAngle)) {
                ++j;
            }
            count = Math.max(count, j - i);
            if (j == radianAngleList.size()) {
                break;
            }
            while (i < n && i <= j && (radianAngleList.get(j) - radianAngleList.get(i) > radianAngle)) {
                ++i;
            }
        }
        return startCount + count;
    }
}
