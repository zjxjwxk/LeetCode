package com.zjxjwxk.leetcode._0630_Course_Schedule_III;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 最大堆+贪心
 * @author Xinkang Wu
 * @date 2021/12/14 16:27
 */
public class Solution {

    public int scheduleCourse(int[][] courses) {
        int curTime = 0;
        Queue<Integer> maxHeap = new PriorityQueue<>((time1, time2) -> time2 - time1);
        Arrays.sort(courses, Comparator.comparingInt(course -> course[1]));
        for (int[] course : courses) {
            int costTime = course[0];
            if (curTime + costTime <= course[1]) {
                curTime += costTime;
                maxHeap.offer(costTime);
            } else if (!maxHeap.isEmpty() && maxHeap.peek() > costTime) {
                curTime = curTime - maxHeap.poll() + costTime;
                maxHeap.offer(costTime);
            }
        }
        return maxHeap.size();
    }
}
