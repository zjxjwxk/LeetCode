package com.zjxjwxk.leetcode._013_Roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zjxjwxk
 */
public class Solution {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int length = s.length();
        int sum = map.get(s.charAt(length - 1));
        for (int i = length - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                sum -= map.get(s.charAt(i));
            } else {
                sum += map.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
