package com.zjxjwxk.leetcode._0155_Min_Stack;

/**
 * 只使用一个栈
 * @author zjxjwxk
 * @date 2020/9/28 3:36 下午
 */
public class MinStack3 {

    int[] stack;
    int index = -1;

    public MinStack3() {
        stack = new int[40000];
    }

    public void push(int x) {
        stack[++index] = x;
        if (index == 0) {
            stack[++index] = x;
        } else {
            stack[index + 1] = Math.min(x, stack[index - 1]);
            ++index;
        }
    }

    public void pop() {
        index -= 2;
    }

    public int top() {
        return stack[index - 1];
    }

    public int getMin() {
        return stack[index];
    }
}
