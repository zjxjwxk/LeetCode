package com.zjxjwxk.leetcode._2940_Find_Building_Where_Alice_and_Bob_Can_Meet;

import java.util.ArrayList;
import java.util.List;

/**
 * 单调栈+二分搜索
 * @author Xinkang Wu
 * @date 2024/8/11 01:57
 */
public class Solution {

    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
        int[] stack = new int[heights.length], ans = new int[queries.length];
        int top = -1;
        List<int[]>[] queryLists = new ArrayList[heights.length];
        for (int i = 0; i < queries.length; ++i) {
            // 为方便后续，预处理使得a<b
            int a = Math.min(queries[i][0], queries[i][1]);
            int b = Math.max(queries[i][0], queries[i][1]);
            if (a == b || heights[a] < heights[b]) {
                ans[i] = b;
                continue;
            }
            if (queryLists[b] == null) {
                queryLists[b] = new ArrayList<>();
            }
            // 记录每个query的index，以及b所对应的a的高度，用于后续对单调栈作二分搜索
            queryLists[b].add(new int[]{i, heights[a]});
        }
        // 从右往左遍历，动态构建单调栈，避免b左侧高度对单调栈的影响
        for (int b = heights.length - 1; b >= 0; --b) {
            if (queryLists[b] != null) {
                for (int[] aPair : queryLists[b]) {
                    int queryIndex = aPair[0], aHeight = aPair[1];
                    int stackIndex = binarySearch(stack, heights, 0, top, aHeight);
                    if (stackIndex >= 0) {
                        ans[queryIndex] = stack[stackIndex];
                    } else {
                        ans[queryIndex] = -1;
                    }
                }
            }
            // 将当前高度加入严格由大到小排序的单调栈
            while (top >= 0 && heights[b] >= heights[stack[top]]) {
                --top;
            }
            stack[++top] = b;
        }
        return ans;
    }

    private int binarySearch(int[] stack, int[] heights, int left, int right, int target) {
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (target < heights[stack[mid]]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
