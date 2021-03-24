package com.zjxjwxk.leetcode._0341_Flatten_Nested_List_Iterator;

import java.util.*;

/**
 * 栈
 * @author Xinkang Wu
 * @date 2021/3/23 20:48
 */
public class NestedIterator2 implements Iterator<Integer> {

    private final Deque<Iterator<NestedInteger>> stack;

    public NestedIterator2(List<NestedInteger> nestedList) {
        stack = new ArrayDeque<>();
        this.stack.push(nestedList.iterator());
    }

    @Override
    public Integer next() {
        return stack.peek().next().getInteger();
    }

    @Override
    public boolean hasNext() {
        if (pop()) {
            return false;
        }
        NestedInteger nestedInteger = stack.peek().next();
        while (!nestedInteger.isInteger()) {
            stack.push(nestedInteger.getList().iterator());
            if (pop()) {
                return false;
            }
            nestedInteger = stack.peek().next();
        }
        stack.push(Collections.singletonList(nestedInteger).iterator());
        return true;
    }

    private boolean pop() {
        while (!stack.isEmpty() && !stack.peek().hasNext()) {
            stack.pop();
        }
        return stack.isEmpty();
    }
}