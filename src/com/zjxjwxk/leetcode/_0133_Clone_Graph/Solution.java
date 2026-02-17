package com.zjxjwxk.leetcode._0133_Clone_Graph;

import java.util.*;

/**
 * DFS
 *
 * @author Xinkang Wu
 * @date 2026/2/17 23:36
 */
public class Solution {

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Node target = new Node(node.val);
        cloneGraph(node, target, new HashMap<>());
        return target;
    }

    private void cloneGraph(Node source, Node target, Map<Integer, Node> targetMap) {
        if (source == null || targetMap.containsKey(target.val)) {
            return;
        }
        targetMap.put(target.val, target);
        target.neighbors = new ArrayList<>(source.neighbors.size());
        for (Node sourceNeighbor : source.neighbors) {
            Node targetNeighbor = targetMap.getOrDefault(sourceNeighbor.val, new Node(sourceNeighbor.val));
            target.neighbors.add(targetNeighbor);
            cloneGraph(sourceNeighbor, targetNeighbor, targetMap);
        }
    }
}

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
