package com.zjxjwxk.leetcode._0284_Peeking_Iterator;

import org.junit.jupiter.api.Test;

class PeekingIteratorTest {

    @Test
    void test() {
        int[] nums = {1, 2, 3};
        PeekingIterator peekingIterator = new PeekingIterator(nums);
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.peek());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.next());
        System.out.println(peekingIterator.hasNext());
    }
}