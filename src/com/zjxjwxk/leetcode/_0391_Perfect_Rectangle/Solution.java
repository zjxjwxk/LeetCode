package com.zjxjwxk.leetcode._0391_Perfect_Rectangle;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/11/16 16:12
 */
public class Solution {

    public boolean isRectangleCover(int[][] rectangles) {
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        long areaSum = 0;
        Map<Point, Integer> pointCountMap = new HashMap<>();
        for (int[] rectangle : rectangles) {
            int x = rectangle[0], y = rectangle[1], a = rectangle[2], b = rectangle[3];
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, a);
            maxY = Math.max(maxY, b);
            areaSum += (long) (a - x) * (b - y);
            pointCountMap.merge(new Point(x, y), 1, Integer::sum);
            pointCountMap.merge(new Point(a, b), 1, Integer::sum);
            pointCountMap.merge(new Point(x, b), 1, Integer::sum);
            pointCountMap.merge(new Point(a, y), 1, Integer::sum);
        }
        Point pointMinMin = new Point(minX, minY);
        Point pointMinMax = new Point(minX, maxY);
        Point pointMaxMax = new Point(maxX, maxY);
        Point pointMaxMin = new Point(maxX, minY);
        if ((maxX - minX) * (maxY - minY) != areaSum
                || pointCountMap.getOrDefault(pointMinMin, 0) != 1
                || pointCountMap.getOrDefault(pointMinMax, 0) != 1
                || pointCountMap.getOrDefault(pointMaxMax, 0) != 1
                || pointCountMap.getOrDefault(pointMaxMin, 0) != 1) {
            return false;
        }
        pointCountMap.remove(pointMinMin);
        pointCountMap.remove(pointMinMax);
        pointCountMap.remove(pointMaxMax);
        pointCountMap.remove(pointMaxMin);
        for (Integer count : pointCountMap.values()) {
            if (count != 2 && count != 4) {
                return false;
            }
        }
        return true;
    }

    static class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Point point = (Point) o;
            return x == point.x &&
                    y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
