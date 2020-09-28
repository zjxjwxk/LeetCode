package com.zjxjwxk.leetcode._0155_Min_Stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 利用辅助栈存储最小值（Deque实现）
 * @author zjxjwxk
 * @date 2020/9/28 3:38 下午
 */
public class MinStack2 {

    Deque<Integer> stack, min;

    public MinStack2() {
        stack = new LinkedList<>();
        min = new LinkedList<>();
        min.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        min.push(Math.min(x, min.peek()));
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
