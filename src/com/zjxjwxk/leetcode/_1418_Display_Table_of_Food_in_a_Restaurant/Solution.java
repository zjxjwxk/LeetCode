package com.zjxjwxk.leetcode._1418_Display_Table_of_Food_in_a_Restaurant;

import java.util.*;

/**
 * 哈希表
 *
 * @author Xinkang Wu
 * @date 2021/7/6 22:26
 */
public class Solution {

    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, Map<String, Integer>> tableMap = new TreeMap<>(Comparator.comparingInt(Integer::parseInt));
        Set<String> foodSet = new TreeSet<>();
        for (List<String> order : orders) {
            String tableNum = order.get(1);
            String foodItem = order.get(2);
            Map<String, Integer> foodCountMap = tableMap.getOrDefault(tableNum, new HashMap<>());
            foodCountMap.merge(foodItem, 1, Integer::sum);
            tableMap.put(tableNum, foodCountMap);
            foodSet.add(foodItem);
        }
        List<String> title = new ArrayList<>(1 + foodSet.size());
        title.add("Table");
        title.addAll(foodSet);
        ans.add(title);
        for (Map.Entry<String, Map<String, Integer>> entry : tableMap.entrySet()) {
            Map<String, Integer> foodCountMap = entry.getValue();
            List<String> table = new ArrayList<>(1 + foodSet.size());
            table.add(entry.getKey());
            for (String food : foodSet) {
                table.add(String.valueOf(foodCountMap.getOrDefault(food, 0)));
            }
            ans.add(table);
        }
        return ans;
    }
}
