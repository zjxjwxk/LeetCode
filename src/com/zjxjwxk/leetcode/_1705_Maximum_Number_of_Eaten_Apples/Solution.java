package com.zjxjwxk.leetcode._1705_Maximum_Number_of_Eaten_Apples;

import java.util.Map;
import java.util.TreeMap;

/**
 * 贪心+有序哈希表
 * @author Xinkang Wu
 * @date 2021/12/27 23:29
 */
public class Solution {

    public int eatenApples(int[] apples, int[] days) {
        int n = apples.length, curDay, ans = 0;
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (curDay = 0; curDay < n; ++curDay) {
            if (apples[curDay] > 0) {
                countMap.merge(curDay + days[curDay], apples[curDay], Integer::sum);
            }
            Map.Entry<Integer, Integer> firstEntry = countMap.firstEntry();
            while (firstEntry != null && (firstEntry.getKey() <= curDay || firstEntry.getValue() == 0)) {
                countMap.remove(firstEntry.getKey());
                firstEntry = countMap.firstEntry();
            }
            if (firstEntry != null) {
                countMap.put(firstEntry.getKey(), firstEntry.getValue() - 1);
                ++ans;
            }
        }
        while (!countMap.isEmpty()) {
            Map.Entry<Integer, Integer> firstEntry = countMap.pollFirstEntry();
            int addDay = Math.min(firstEntry.getKey() - curDay, firstEntry.getValue());
            ans += addDay;
            curDay += addDay;
        }
        return ans;
    }
}
