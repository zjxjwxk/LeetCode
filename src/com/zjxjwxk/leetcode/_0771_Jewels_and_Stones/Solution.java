package com.zjxjwxk.leetcode._0771_Jewels_and_Stones;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zjxjwxk
 * @date 2020/10/2 11:00 上午
 */
public class Solution {

    public int numJewelsInStones(String J, String S) {
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < J.length(); ++i) {
            map.put(J.charAt(i), true);
        }
        int count = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (map.get(S.charAt(i)) != null) {
                ++count;
            }
        }
        return count;
    }
}
