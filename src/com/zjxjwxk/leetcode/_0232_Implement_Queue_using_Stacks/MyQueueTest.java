package com.zjxjwxk.leetcode._0232_Implement_Queue_using_Stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void test1() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(1);
        assertEquals(1, myQueue.peek());
        assertEquals(1, myQueue.pop());
        assertFalse(myQueue.empty());
    }
}