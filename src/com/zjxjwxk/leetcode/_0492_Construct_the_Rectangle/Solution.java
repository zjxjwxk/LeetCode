package com.zjxjwxk.leetcode._0492_Construct_the_Rectangle;

/**
 * 数学
 * @author Xinkang Wu
 * @date 2021/10/23 11:28
 */
public class Solution {

    public int[] constructRectangle(int area) {
        int l, w = (int) Math.sqrt(area);
        while (area % w != 0) {
            --w;
        }
        l = area / w;
        return new int[]{l, w};
    }
}
