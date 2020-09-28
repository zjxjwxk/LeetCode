package com.zjxjwxk.leetcode._0155_Min_Stack;

/**
 * 只使用一个栈
 * @author zjxjwxk
 * @date 2020/9/28 3:36 下午
 */
public class MinStack3 {

    int[] stack;
    int count = -1;

    public MinStack3() {
        stack = new int[40000];
    }

    public void push(int x) {
        stack[++count] = x;
        if (count == 0) {
            stack[++count] = x;
        } else {
            stack[count + 1] = Math.min(x, stack[count - 1]);
            ++count;
        }
    }

    public void pop() {
        count -= 2;
    }

    public int top() {
        return stack[count - 1];
    }

    public int getMin() {
        return stack[count];
    }
}
