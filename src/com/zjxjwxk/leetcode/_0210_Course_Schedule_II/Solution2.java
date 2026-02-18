package com.zjxjwxk.leetcode._0210_Course_Schedule_II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 拓扑排序（BFS）
 *
 * @author Xinkang Wu
 * @date 2026/2/18 21:31
 */
public class Solution2 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        int[] preCounts = new int[numCourses];
        Queue<Integer> readyQueue = new LinkedList<>();
        for (int i = 0; i < numCourses; ++i) {
            graph.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
            ++preCounts[prerequisite[0]];
        }
        for (int i = 0; i < numCourses; ++i) {
            if (preCounts[i] == 0) {
                readyQueue.offer(i);
            }
        }
        int[] ans = new int[numCourses];
        int index = 0;
        while (!readyQueue.isEmpty()) {
            int course = readyQueue.poll();
            ans[index++] = course;
            for (Integer next : graph.get(course)) {
                if (--preCounts[next] == 0) {
                    readyQueue.offer(next);
                }
            }
        }
        if (index < numCourses) {
            return new int[]{};
        }
        return ans;
    }
}
