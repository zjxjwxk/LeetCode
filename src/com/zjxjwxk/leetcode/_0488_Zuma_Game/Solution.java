package com.zjxjwxk.leetcode._0488_Zuma_Game;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 广度优先搜索
 * @author Xinkang Wu
 * @date 2021/11/9 16:12
 */
public class Solution {

    public int findMinStep(String board, String hand) {
        Queue<StringBuilder[]> queue = new LinkedList<>();
        char[] sortedHand = hand.toCharArray();
        Arrays.sort(sortedHand);
        queue.offer(new StringBuilder[]{new StringBuilder(board), new StringBuilder(new String(sortedHand))});
        while (!queue.isEmpty()) {
            StringBuilder[] cur = queue.poll();
            StringBuilder curBoard = cur[0];
            StringBuilder curHand = cur[1];
            for (int i = 0; i < curHand.length(); ++i) {
                char curHandChar = curHand.charAt(i);
                if (i > 0 && curHandChar == curHand.charAt(i - 1)) {
                    continue;
                }
                for (int j = 0; j < curBoard.length(); ++j) {
                    if (j > 0 && curHandChar == curBoard.charAt(j - 1)) {
                        continue;
                    }
                    if (j > 0 && j < curBoard.length() && curHandChar != curBoard.charAt(j) && curBoard.charAt(j - 1) != curBoard.charAt(j)) {
                        continue;
                    }
                    StringBuilder nextBoard = clean(new StringBuilder(curBoard).insert(j, curHandChar));
                    if (nextBoard.length() == 0) {
                        return hand.length() - curHand.length() + 1;
                    }
                    StringBuilder nextHand = new StringBuilder(curHand);
                    nextHand.deleteCharAt(i);
                    queue.offer(new StringBuilder[]{nextBoard, nextHand});
                }
            }
        }
        return -1;
    }

    public StringBuilder clean(StringBuilder board) {
        int end = board.length();
        while (true) {
            boolean cleaned = false;
            int i = 0, j1 = 0, j2 = 1;
            while (j1 < end) {
                while (j2 < end && board.charAt(j2) == board.charAt(j1)) {
                    ++j2;
                }
                if (j2 - j1 >= 3) {
                    cleaned = true;
                } else {
                    for (int index = 0; index < (j2 - j1); ++index) {
                        board.setCharAt(i++, board.charAt(j1));
                    }
                }
                j1 = j2;
                ++j2;
            }
            end = i;
            if (!cleaned) {
                break;
            }
        }
        return new StringBuilder(board.substring(0, end));
    }
}
