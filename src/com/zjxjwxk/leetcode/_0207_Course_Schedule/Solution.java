package com.zjxjwxk.leetcode._0207_Course_Schedule;

import java.util.*;

/**
 * 深度优先搜索
 * @author Xinkang Wu
 * @date 2021/12/14 12:06
 */
public class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> preCourseMap = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            List<Integer> preCourseList = preCourseMap.getOrDefault(course, new ArrayList<>());
            preCourseList.add(prerequisite[1]);
            preCourseMap.put(course, preCourseList);
        }
        int[] status = new int[numCourses];
        for (int i = 0; i < numCourses; ++i) {
            if (!dfs(preCourseMap, status, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(Map<Integer, List<Integer>> preCourseMap, int[] status, int course) {
        if (status[course] == 2) {
            return true;
        }
        List<Integer> preCourseList = preCourseMap.get(course);
        if (preCourseList == null) {
            status[course] = 2;
            return true;
        }
        status[course] = 1;
        for (int preCourse : preCourseList) {
            if (status[preCourse] == 1 || !dfs(preCourseMap, status, preCourse)) {
                return false;
            }
        }
        status[course] = 2;
        return true;
    }
}
