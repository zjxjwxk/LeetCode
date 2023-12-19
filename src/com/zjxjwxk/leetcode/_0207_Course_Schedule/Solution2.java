package com.zjxjwxk.leetcode._0207_Course_Schedule;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * 拓扑排序（广度优先搜索）
 * @author Xinkang Wu
 * @date 2023/12/19 23:28
 */
public class Solution2 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Set<Integer>[] nextSets = new HashSet[numCourses];
        int[] indegrees = new int[numCourses];
        for (int i = 0; i < numCourses; ++i) {
            nextSets[i] = new HashSet<>();
        }
        for (int[] prerequisite : prerequisites) {
            int cur = prerequisite[0], pre = prerequisite[1];
            nextSets[pre].add(cur);
            ++indegrees[cur];
        }
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; ++i) {
            if (indegrees[i] == 0) {
                queue.offer(i);
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            ++count;
            Integer cur = queue.poll();
            for (Integer next: nextSets[cur]) {
                --indegrees[next];
                if (indegrees[next] == 0) {
                    queue.offer(next);
                }
            }
        }
        return count == numCourses;
    }
}
