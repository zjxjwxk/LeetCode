package com.zjxjwxk.leetcode._0150_Evaluate_Reverse_Polish_Notation;

import java.util.*;

/**
 * 栈
 *
 * @author Xinkang Wu
 * @date 2021/3/20 11:16
 */
public class Solution {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        Set<String> operatorSet = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        for (String token : tokens) {
            if (operatorSet.contains(token)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = 0;
                switch (token) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
