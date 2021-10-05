package com.zjxjwxk.leetcode._0284_Peeking_Iterator;

import java.util.Iterator;

/**
 * 迭代器实现
 * @author Xinkang Wu
 * @date 2021/10/5 13:17
 */
public class PeekingIterator2 implements Iterator<Integer> {

    private final Iterator<Integer> iterator;
    private Integer peek;

    public PeekingIterator2(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        peek = iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return peek;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        int ret = peek;
        if (iterator.hasNext()) {
            peek = iterator.next();
        } else {
            peek = null;
        }
        return ret;
    }

    @Override
    public boolean hasNext() {
        return peek != null;
    }
}
