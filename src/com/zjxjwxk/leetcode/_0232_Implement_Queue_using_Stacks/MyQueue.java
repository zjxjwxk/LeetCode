package com.zjxjwxk.leetcode._0232_Implement_Queue_using_Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 双栈
 * @author Xinkang Wu
 * @date 2021/3/5 12:00
 */
public class MyQueue {

    private final Deque<Integer> frontStack;
    private final Deque<Integer> backStack;

    /** Initialize your data structure here. */
    public MyQueue() {
        frontStack = new ArrayDeque<>();
        backStack = new ArrayDeque<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        backStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (frontStack.isEmpty()) {
            while (!backStack.isEmpty()) {
                frontStack.push(backStack.pop());
            }
        }
        return frontStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (frontStack.isEmpty()) {
            while (!backStack.isEmpty()) {
                frontStack.push(backStack.pop());
            }
        }
        return frontStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return frontStack.isEmpty() && backStack.isEmpty();
    }
}
