package com.zjxjwxk.leetcode._0682_Baseball_Game;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2024/7/29 23:46
 */
public class Solution {

    public int calPoints(String[] operations) {
        List<Integer> scoreList = new ArrayList<>();
        int total = 0;
        for (String operation : operations) {
            int size = scoreList.size(), score;
            switch(operation) {
                case "+":
                    score = scoreList.get(size - 1) + scoreList.get(size - 2);
                    scoreList.add(score);
                    total += score;
                    break;
                case "D":
                    score = scoreList.get(size - 1) << 1;
                    scoreList.add(score);
                    total += score;
                    break;
                case "C":
                    score = scoreList.remove(size - 1);
                    total -= score;
                    break;
                default:
                    score = Integer.parseInt(operation);
                    scoreList.add(score);
                    total += score;
            }
        }
        return total;
    }
}
