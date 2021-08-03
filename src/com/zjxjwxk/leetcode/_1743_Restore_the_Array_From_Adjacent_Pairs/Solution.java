package com.zjxjwxk.leetcode._1743_Restore_the_Array_From_Adjacent_Pairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 哈希表
 * @author Xinkang Wu
 * @date 2021/8/3 15:20
 */
public class Solution {

    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> adMap = new HashMap<>();
        for (int[] adjacentPair : adjacentPairs) {
            List<Integer> adList1 = adMap.getOrDefault(adjacentPair[0], new ArrayList<>(2));
            List<Integer> adList2 = adMap.getOrDefault(adjacentPair[1], new ArrayList<>(2));
            adList1.add(adjacentPair[1]);
            adList2.add(adjacentPair[0]);
            adMap.put(adjacentPair[0], adList1);
            adMap.put(adjacentPair[1], adList2);
        }
        int len = adjacentPairs.length + 1;
        int[] ans = new int[len];
        for (Map.Entry<Integer, List<Integer>> entry : adMap.entrySet()) {
            List<Integer> adList = entry.getValue();
            if (adList.size() == 1) {
                ans[0] = entry.getKey();
                ans[1] = adList.get(0);
                break;
            }
        }
        for (int i = 2; i < len; ++i) {
            List<Integer> adList = adMap.get(ans[i - 1]);
            ans[i] = adList.get(0) == ans[i - 2] ? adList.get(1) : adList.get(0);
        }
        return ans;
    }
}
