package com.zjxjwxk.leetcode._0155_Min_Stack;

/**
 * 利用辅助栈存储最小值（数组实现）
 * @author zjxjwxk
 * @date 2020/9/28 2:25 下午
 */
public class MinStack {

    int[] stack, min;
    int index = -1;

    public MinStack() {
        stack = new int[20000];
        min = new int[20000];
    }

    public void push(int x) {
        if (index == -1 || x < min[index]) {
            min[index + 1] = x;
        } else {
            min[index + 1] = min[index];
        }
        stack[++index] = x;
    }

    public void pop() {
        --index;
    }

    public int top() {
        return stack[index];
    }

    public int getMin() {
        return min[index];
    }
}
