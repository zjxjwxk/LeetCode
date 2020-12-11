package com.zjxjwxk.leetcode._0649_Dota2_Senate;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 循环队列
 * @author Xinkang Wu
 * @date 2020/12/11 10:56
 */
public class Solution {

    public String predictPartyVictory(String senate) {
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();
        for (int i = 0; i < senate.length(); ++i) {
            if (senate.charAt(i) == 'R') {
                rQueue.offer(i);
            } else {
                dQueue.offer(i);
            }
        }
        int num = senate.length();
        while (!rQueue.isEmpty() && !dQueue.isEmpty()) {
            int rIndex = rQueue.poll(), dIndex = dQueue.poll();
            if (rIndex < dIndex) {
                rQueue.offer(num++);
            } else {
                dQueue.offer(num++);
            }
        }
        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }
}
