package com.zjxjwxk.leetcode._0433_Minimum_Genetic_Mutation;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * BFS
 *
 * @author Xinkang Wu
 * @date 2026/2/20 00:24
 */
public class Solution {

    public int minMutation(String startGene, String endGene, String[] bank) {
        if (startGene.equals(endGene)) {
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        Set<String> visitedSet = new HashSet<>();
        Set<String> bankSet = new HashSet<>();
        char[] keys = {'A', 'C', 'G', 'T'};
        for (String gene : bank) {
            bankSet.add(gene);
        }
        if (!bankSet.contains(endGene)) {
            return -1;
        }
        queue.offer(startGene);
        visitedSet.add(startGene);
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ++count;
            for (int i = 0; i < size; ++i) {
                String gene = queue.poll();
                for (int j = 0; j < gene.length(); ++j) {
                    for (char key : keys) {
                        if (gene.charAt(j) != key) {
                            StringBuilder sb = new StringBuilder(gene);
                            sb.setCharAt(j, key);
                            String nextGene = sb.toString();
                            if (nextGene.equals(endGene)) {
                                return count;
                            }
                            if (bankSet.contains(nextGene) && !visitedSet.contains(nextGene)) {
                                queue.offer(nextGene);
                                visitedSet.add(nextGene);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
}
