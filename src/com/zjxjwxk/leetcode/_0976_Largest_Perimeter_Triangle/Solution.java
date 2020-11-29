package com.zjxjwxk.leetcode._0976_Largest_Perimeter_Triangle;

import java.util.Arrays;

/**
 * 贪心+排序
 * @author Xinkang Wu
 * @date 2020/11/29 12:56
 */
public class Solution {

    public int largestPerimeter(int[] A) {
        int len = A.length;
        Arrays.sort(A);
        for (int i = len - 1; i >= 2; --i) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }
        return 0;
    }
}
