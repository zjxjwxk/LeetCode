package com.zjxjwxk.leetcode._0341_Flatten_Nested_List_Iterator;

import java.util.*;

/**
 * 深度优先搜索（预处理）
 * @author Xinkang Wu
 * @date 2021/3/23 20:48
 */
public class NestedIterator implements Iterator<Integer> {

    private final List<Integer> list;
    private final Iterator<Integer> iterator;

    public NestedIterator(List<NestedInteger> nestedList) {
        list = new ArrayList<>();
        dfs(nestedList);
        iterator = list.iterator();
    }

    @Override
    public Integer next() {
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    private void dfs(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                list.add(nestedInteger.getInteger());
            } else {
                dfs(nestedInteger.getList());
            }
        }
    }
}