package com.zjxjwxk.leetcode._0341_Flatten_Nested_List_Iterator;

import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2021/3/23 22:55
 */
public class NestedIntegerImpl implements NestedInteger {

    private Integer integer;
    private List<NestedInteger> list;

    public NestedIntegerImpl(Integer integer) {
        this.integer = integer;
    }

    public NestedIntegerImpl(List<NestedInteger> list) {
        this.list = list;
    }

    @Override
    public boolean isInteger() {
        return this.integer != null;
    }

    @Override
    public Integer getInteger() {
        return this.integer;
    }

    @Override
    public List<NestedInteger> getList() {
        return this.list;
    }
}
