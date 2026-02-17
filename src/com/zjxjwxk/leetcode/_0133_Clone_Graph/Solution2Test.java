package com.zjxjwxk.leetcode._0133_Clone_Graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void cloneGraph() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.neighbors = Arrays.asList(node2, node4);
        node2.neighbors = Arrays.asList(node1, node3);
        node3.neighbors = Arrays.asList(node2, node4);
        node4.neighbors = Arrays.asList(node1, node3);

        Node ans = solution2.cloneGraph(node1);
        // Debug to check answer
        assertNotNull(ans);
    }
}