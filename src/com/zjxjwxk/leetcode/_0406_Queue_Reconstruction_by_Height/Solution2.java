package com.zjxjwxk.leetcode._0406_Queue_Reconstruction_by_Height;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 从高到低考虑
 * @author Xinkang Wu
 * @date 2020/11/16 14:16
 */
public class Solution2 {

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o2[0] - o1[0];
            } else {
                return o1[1] - o2[1];
            }
        });
        List<int[]> linkedList = new LinkedList<>();
        for (int[] person : people) {
            linkedList.add(person[1], person);
        }
        return linkedList.toArray(new int[people.length][2]);
    }
}
