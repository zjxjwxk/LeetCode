package com.zjxjwxk.leetcode._1203_Sort_Items_by_Groups_Respecting_Dependencies;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 拓扑排序
 * @author Xinkang Wu
 * @date 2021/1/12 20:04
 */
public class Solution {

    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
        for (int i = 0; i < group.length; ++i) {
            if (group[i] == -1) {
                group[i] = m++;
            }
        }
        int[] itemIn = new int[n], groupIn = new int[m], ans = new int[n];
        List<Integer>[] itemChildListArr = new ArrayList[n];
        List<Integer>[] groupChildListArr = new ArrayList[m];
        for (int i = 0; i < n; ++i) {
            itemChildListArr[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; ++i) {
            groupChildListArr[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; ++i) {
            List<Integer> beforeList = beforeItems.get(i);
            for (Integer before : beforeList) {
                ++itemIn[i];
                itemChildListArr[before].add(i);
                if (group[i] != group[before]) {
                    ++groupIn[group[i]];
                    groupChildListArr[group[before]].add(group[i]);
                }
            }
        }
        List<Integer> sortedItemList = topologicalSort(itemChildListArr, itemIn);
        if (sortedItemList.size() != n) {
            return new int[0];
        }
        List<Integer> sortedGroupList = topologicalSort(groupChildListArr, groupIn);
        if (sortedGroupList.size() != m) {
            return new int[0];
        }
        List<List<Integer>> groupSortedItemList = new ArrayList<>(m + 1);
        for (int i = 0; i < m + 1; ++i) {
            groupSortedItemList.add(new ArrayList<>());
        }
        for (Integer item : sortedItemList) {
            int groupOfItem = group[item];
            if (groupOfItem != -1) {
                groupSortedItemList.get(groupOfItem).add(item);
            } else {
                groupSortedItemList.get(m).add(item);
            }
        }
        int index = 0;
        for (Integer groupIndex : sortedGroupList) {
            for (Integer item : groupSortedItemList.get(groupIndex)) {
                ans[index++] = item;
            }
        }
        return ans;
    }

    private List<Integer> topologicalSort(List<Integer>[] childListArr, int[] in) {
        Queue<Integer> queue = new LinkedList<>();
        int len = childListArr.length;
        List<Integer> sortedList = new ArrayList<>();
        for (int i = 0; i < len; ++i) {
            if (in[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int item = queue.poll();
            sortedList.add(item);
            for (Integer child : childListArr[item]) {
                if (--in[child] == 0) {
                    queue.offer(child);
                }
            }
        }
        return sortedList;
    }
}
