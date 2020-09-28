package com.zjxjwxk.leetcode._0155_Min_Stack;

/**
 * 利用辅助栈存储最小值（数组实现）
 * @author zjxjwxk
 * @date 2020/9/28 2:25 下午
 */
public class MinStack {

    int[] stack, min;
    int count = -1;

    public MinStack() {
        stack = new int[20000];
        min = new int[20000];
    }

    public void push(int x) {
        if (count == -1) {
            min[0] = x;
        } else {
            min[count + 1] = Math.min(x, min[count]);
        }
        stack[++count] = x;
    }

    public void pop() {
        --count;
    }

    public int top() {
        return stack[count];
    }

    public int getMin() {
        return min[count];
    }
}
