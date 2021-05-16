package com.zjxjwxk.leetcode._0013_Roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟
 * @author zjxjwxk
 */
public class Solution {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] chars = s.toCharArray();
        int len = chars.length, ans = 0, cur = map.get(chars[0]);
        for (int i = 0; i < len - 1; ++i) {
            int next = map.get(chars[i + 1]);
            if (cur < next) {
                ans -= cur;
            } else {
                ans += cur;
            }
            cur = next;
        }
        return ans + cur;
    }
}
