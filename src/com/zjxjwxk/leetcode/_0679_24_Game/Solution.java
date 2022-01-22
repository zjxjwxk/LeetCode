package com.zjxjwxk.leetcode._0679_24_Game;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯
 * @author Xinkang Wu
 * @date 2022/1/22 16:09
 */
public class Solution {

    private static final double EPSILON = 1e-6;

    public boolean judgePoint24(int[] cards) {
        List<Double> cardList = new ArrayList<>(4);
        for (int card : cards) {
            cardList.add((double) card);
        }
        return backtrack(cardList);
    }

    private boolean backtrack(List<Double> cardList) {
        if (cardList.size() == 1) {
            return Math.abs(cardList.get(0) - 24) < EPSILON;
        }
        for (int i = 0; i < cardList.size(); ++i) {
            for (int j = i; j < cardList.size() - 1; ++j) {
                double first = cardList.remove(i);
                double second = cardList.remove(j);
                if (operation(cardList, first + second)
                        || operation(cardList, first - second)
                        || operation(cardList, second - first)
                        || operation(cardList, first * second)
                        || Math.abs(second) >= EPSILON && operation(cardList, first / second)
                        || Math.abs(first) >= EPSILON && operation(cardList, second / first)) {
                    return true;
                }
                cardList.add(j, second);
                cardList.add(i, first);
            }
        }
        return false;
    }

    private boolean operation(List<Double> cardList, double num) {
        cardList.add(num);
        if (backtrack(cardList)) {
            return true;
        }
        cardList.remove(cardList.size() - 1);
        return false;
    }
}
