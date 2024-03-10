package com.zjxjwxk.leetcode._0008_String_to_Integer_atoi;

import java.util.HashMap;
import java.util.Map;

/**
 * 有限状态机
 * @author Xinkang Wu
 * @date 2024/3/11 01:38
 */
public class Solution2 {

    public int myAtoi(String s) {
        int len = s.length();
        Automaton automaton = new Automaton();
        for (int i = 0; i < len; ++i) {
            automaton.get(s.charAt(i));
        }
        return (int) (automaton.sign * automaton.ans);
    }

    static class Automaton {
        private int sign = 1;
        private long ans = 0;
        private String state = "start";
        private final Map<String, String[]> table = new HashMap<String, String[]>(){{
            put("start", new String[]{"start", "signed", "in_number", "end"});
            put("signed", new String[]{"end", "end", "in_number", "end"});
            put("in_number", new String[]{"end", "end", "in_number", "end"});
            put("end", new String[]{"end", "end", "end", "end"});
        }};

        public void get(char c) {
            state = table.get(state)[getIndex(c)];
            if ("in_number".equals(state)) {
                ans = ans * 10 + c - '0';
                ans = Math.min(ans, sign == 1 ? (long) Integer.MAX_VALUE : -(long) Integer.MIN_VALUE);
            } else if ("signed".equals(state)) {
                sign = c == '+' ? 1 : -1;
            }
        }

        private int getIndex(char c) {
            if (c == ' ') {
                return 0;
            }
            if (c == '+' || c == '-') {
                return 1;
            }
            if (c >= '0' && c <= '9') {
                return 2;
            }
            return 3;
        }
    }
}
