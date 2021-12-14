package com.zjxjwxk.leetcode._0210_Course_Schedule_II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 深度优先搜索
 * @author Xinkang Wu
 * @date 2021/12/14 14:38
 */
public class Solution {

    private int[] ans;
    private int index;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ans = new int[numCourses];
        index = 0;
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
                return new int[]{};
            }
        }
        return ans;
    }

    private boolean dfs(Map<Integer, List<Integer>> preCourseMap, int[] status, int course) {
        if (status[course] == 2) {
            return true;
        }
        List<Integer> preCourseList = preCourseMap.get(course);
        if (preCourseList == null) {
            status[course] = 2;
            ans[index++] = course;
            return true;
        }
        status[course] = 1;
        for (int preCourse : preCourseList) {
            if (status[preCourse] == 1 || !dfs(preCourseMap, status, preCourse)) {
                return false;
            }
        }
        status[course] = 2;
        ans[index++] = course;
        return true;
    }
}
