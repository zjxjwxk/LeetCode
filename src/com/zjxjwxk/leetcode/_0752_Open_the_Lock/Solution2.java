package com.zjxjwxk.leetcode._0752_Open_the_Lock;

import java.util.*;

/**
 * 广度优先搜索（StringBuilder）
 * @author Xinkang Wu
 * @date 2022/1/12 17:21
 */
public class Solution2 {

    public int openLock(String[] deadends, String target) {
        String begin = "0000";
        if (begin.equals(target)) {
            return 0;
        }
        Set<String> deadSet = new HashSet<>(Arrays.asList(deadends));
        if (deadSet.contains(begin)) {
            return -1;
        }
        Queue<String> queue = new LinkedList<>();
        Set<String> visitedSet = new HashSet<>();
        queue.offer(begin);
        visitedSet.add(begin);
        int step = 0;
        int[] rotates = {1, -1};
        while (!queue.isEmpty()) {
            ++step;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                String num = queue.poll();
                for (int j = 0; j < 4; ++j) {
                    char ch = num.charAt(j);
                    for (int rotate : rotates) {
                        StringBuilder nextStringBuilder = new StringBuilder(num);
                        nextStringBuilder.setCharAt(j, (char) (((ch - '0') + rotate + 10) % 10 + '0'));
                        String nextString = nextStringBuilder.toString();
                        if (visitedSet.contains(nextString) || deadSet.contains(nextString)) {
                            continue;
                        }
                        if (nextString.equals(target)) {
                            return step;
                        }
                        visitedSet.add(nextString);
                        queue.offer(nextString);
                    }
                }
            }
        }
        return -1;
    }
}
