package com.zjxjwxk.leetcode._0394_Decode_String;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Xinkang Wu
 * @date 2025/8/8 16:40
 */
public class Solutioin {

    public String decodeString(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        Deque<Integer> numStack = new LinkedList<>();
        Deque<StringBuilder> strStack = new LinkedList<>();
        StringBuilder strSb = new StringBuilder();
        StringBuilder numSb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                numSb.append(ch);
            } else if (ch == '[') {
                strStack.push(strSb);
                strSb = new StringBuilder();
                numStack.push(Integer.parseInt(numSb.toString()));
                numSb = new StringBuilder();
            } else if (ch == ']') {
                Integer num = numStack.pop();
                StringBuilder decoded = new StringBuilder();
                for (int j = 0; j < num; ++j) {
                    decoded.append(strSb);
                }
                strSb = strStack.pop().append(decoded);
            } else {
                strSb.append(ch);
            }
        }
        return strSb.toString();
    }
}
