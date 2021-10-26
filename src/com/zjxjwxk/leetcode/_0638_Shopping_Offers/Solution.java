package com.zjxjwxk.leetcode._0638_Shopping_Offers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 记忆化搜索
 * @author Xinkang Wu
 * @date 2021/10/25 20:19
 */
public class Solution {

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int n = price.size();
        List<List<Integer>> filteredSpecial = new ArrayList<>();
        for (List<Integer> sp : special) {
            int totalCount = 0, totalPrice = 0;
            for (int i = 0; i < n; ++i) {
                int count = sp.get(i);
                totalCount += count;
                totalPrice += count * price.get(i);
            }
            if (totalCount > 0 && totalPrice > sp.get(n)) {
                filteredSpecial.add(sp);
            }
        }
        Map<List<Integer>, Integer> dp = new HashMap<>();
        return dfs(needs, price, filteredSpecial, dp, n);
    }

    private int dfs(List<Integer> curNeeds, List<Integer> price, List<List<Integer>> filteredSpecial,
                    Map<List<Integer>, Integer> dp, int n) {
        Integer minPrice = dp.get(curNeeds);
        if (minPrice != null) {
            return minPrice;
        }
        minPrice = 0;
        for (int i = 0; i < n; ++i) {
            minPrice += curNeeds.get(i) * price.get(i);
        }
        for (List<Integer> special : filteredSpecial) {
            List<Integer> nextNeeds = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                if (curNeeds.get(i) < special.get(i)) {
                    break;
                }
                nextNeeds.add(curNeeds.get(i) - special.get(i));
            }
            if (nextNeeds.size() == n) {
                int nextPrice = dfs(nextNeeds, price, filteredSpecial, dp, n) + special.get(n);
                minPrice = Math.min(minPrice, nextPrice);
            }
        }
        dp.put(curNeeds, minPrice);
        return minPrice;
    }
}
