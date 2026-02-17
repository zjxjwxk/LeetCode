package com.zjxjwxk.leetcode._0133_Clone_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DFS（无需辅助方法）
 *
 * @author Xinkang Wu
 * @date 2026/2/17 23:36
 */
public class Solution2 {

    private final Map<Integer, Node> targetMap = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Node target = targetMap.get(node.val);
        if (target != null) {
            return target;
        }
        target = new Node(node.val, new ArrayList<>(node.neighbors.size()));
        targetMap.put(target.val, target);
        for (Node neighbor : node.neighbors) {
            target.neighbors.add(cloneGraph(neighbor));
        }
        return target;
    }
}