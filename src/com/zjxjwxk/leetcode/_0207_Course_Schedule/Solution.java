package com.zjxjwxk.leetcode._0207_Course_Schedule;

import java.util.*;

/**
 * 深度优先搜索（状态机）
 * @author Xinkang Wu
 * @date 2021/12/14 12:06
 */
public class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        int[] states = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(graph, states, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(List<List<Integer>> graph, int[] states, int course) {
        int state = states[course];
        switch(state) {
            case 1:
                return false;
            case 2:
                return true;
            case 0:
                states[course] = 1;
                for (Integer next : graph.get(course)) {
                    if (!dfs(graph, states, next)) {
                        return false;
                    }
                }
        }
        states[course] = 2;
        return true;
    }
}
