package com.zjxjwxk.leetcode._1051_Height_Checker;
import java.util.Arrays;

public class Solution {
    public static int heightChecker(int[] heights) {
        int[] right = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            right[i] = heights[i];
        }
        Arrays.sort(right);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (right[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
    }
}
