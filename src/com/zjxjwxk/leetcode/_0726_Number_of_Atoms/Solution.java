package com.zjxjwxk.leetcode._0726_Number_of_Atoms;

import java.util.*;

/**
 * 栈 + 哈希表
 * @author Xinkang Wu
 * @date 2021/7/5 22:12
 */
public class Solution {

    private int i;
    private int len;
    private char[] chArr;

    public String countOfAtoms(String formula) {
        i = 0;
        chArr = formula.toCharArray();
        len = chArr.length;
        Deque<Map<String, Integer>> stack = new ArrayDeque<>();
        stack.push(new HashMap<>());
        while (i < len) {
            if (chArr[i] == '(') {
                ++i;
                stack.push(new HashMap<>());
            } else if (chArr[i] == ')') {
                ++i;
                Map<String, Integer> popMap = stack.pop();
                Map<String, Integer> topMap = stack.peek();
                int num = getNum();
                for (Map.Entry<String, Integer> entry : popMap.entrySet()) {
                    topMap.merge(entry.getKey(), entry.getValue() * num, Integer::sum);
                }
            } else {
                String atom = getAtom();
                int num = getNum();
                Map<String, Integer> topMap = stack.peek();
                topMap.merge(atom, num, Integer::sum);
            }
        }
        Map<String, Integer> ansMap = stack.pop();
        Map<String, Integer> sortedMap = new TreeMap<>(ansMap);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            sb.append(entry.getKey());
            if (entry.getValue() > 1) {
                sb.append(entry.getValue());
            }
        }
        return sb.toString();
    }

    private String getAtom() {
        StringBuilder sb = new StringBuilder();
        sb.append(chArr[i++]);
        while (i < len && chArr[i] >= 'a' && chArr[i] <= 'z') {
            sb.append(chArr[i++]);
        }
        return sb.toString();
    }

    private int getNum() {
        int num = 0;
        while (i < len && chArr[i] >= '0' && chArr[i] <= '9') {
            num = num * 10 + chArr[i++] - '0';
        }
        return num == 0 ? 1 : num;
    }
}
