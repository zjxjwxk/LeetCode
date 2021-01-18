package com.zjxjwxk.leetcode._0721_Accounts_Merge;

import java.util.*;

/**
 * 哈希表+并查集
 * @author Xinkang Wu
 * @date 2021/1/18 22:40
 */
public class Solution {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Integer> emailIndexMap = new HashMap<>();
        Map<String, String> emailToNameMap = new HashMap<>();
        int index = 0;
        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); ++i) {
                String email = account.get(i);
                if (!emailIndexMap.containsKey(email)) {
                    emailIndexMap.put(email, index++);
                    emailToNameMap.put(email, name);
                }
            }
        }
        int[] parent = new int[index];
        for (int i = 0; i < index; ++i) {
            parent[i] = i;
        }
        for (List<String> account : accounts) {
            int firstEmailIndex = emailIndexMap.get(account.get(1));
            for (int i = 2; i < account.size(); ++i) {
                union(parent, firstEmailIndex, emailIndexMap.get(account.get(i)));
            }
        }
        Map<Integer, List<String>> rootIndexToEmailListMap = new HashMap<>();
        for (String email : emailToNameMap.keySet()) {
            int rootIndex = find(parent, emailIndexMap.get(email));
            rootIndexToEmailListMap.putIfAbsent(rootIndex, new ArrayList<>());
            rootIndexToEmailListMap.get(rootIndex).add(email);
        }
        List<List<String>> ans = new ArrayList<>();
        for (List<String> emailList : rootIndexToEmailListMap.values()) {
            Collections.sort(emailList);
            List<String> list = new ArrayList<>();
            list.add(emailToNameMap.get(emailList.get(0)));
            list.addAll(emailList);
            ans.add(list);
        }
        return ans;
    }

    private void union(int[] parent, int i, int j) {
        int parent1 = find(parent, i);
        int parent2 = find(parent, j);
        if (parent1 != parent2) {
            parent[parent1] = parent2;
        }
    }

    private int find(int[] parent, int index) {
        int root = index;
        while (root != parent[root]) {
            root = parent[root];
        }
        while (index != parent[index]) {
            int tempParent = parent[index];
            parent[index] = root;
            index = tempParent;
        }
        return index;
    }
}
