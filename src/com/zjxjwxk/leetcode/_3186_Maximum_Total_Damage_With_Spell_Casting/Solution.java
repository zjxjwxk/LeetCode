package com.zjxjwxk.leetcode._3186_Maximum_Total_Damage_With_Spell_Casting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 动态规划
 *
 * @author Xinkang Wu
 * @date 2025/10/11 16:12
 */
public class Solution {

    public long maximumTotalDamage(int[] power) {
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int p : power) {
            countMap.merge(p, 1, Integer::sum);
        }
        List<long[]> maxDamageList = new ArrayList<>();
        int preIndex = 0;
        long preMaxDamage = 0, maxTotalDamage = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            long p = entry.getKey(), count = entry.getValue(), maxDamage;
            while (preIndex < maxDamageList.size() && maxDamageList.get(preIndex)[0] < p - 2) {
                preMaxDamage = Math.max(preMaxDamage, maxDamageList.get(preIndex)[1]);
                ++preIndex;
            }
            if (maxDamageList.isEmpty()) {
                maxDamage = p * count;
            } else {
                maxDamage = preMaxDamage + p * count;
            }
            maxDamageList.add(new long[]{p, maxDamage});
            maxTotalDamage = Math.max(maxTotalDamage, maxDamage);
        }
        return maxTotalDamage;
    }
}
