package com.zjxjwxk.leetcode._0138_Copy_List_with_Random_Pointer;

import java.util.Objects;

/**
 * @author Xinkang Wu
 * @date 2021/7/25 22:53
 */
public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Node node = (Node) o;
        return val == node.val &&
                Objects.equals(next, node.next) &&
                Objects.equals(random, node.random);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next, random);
    }
}
