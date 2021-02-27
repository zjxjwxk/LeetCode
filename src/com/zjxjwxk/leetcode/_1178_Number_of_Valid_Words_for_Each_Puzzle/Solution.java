package com.zjxjwxk.leetcode._1178_Number_of_Valid_Words_for_Each_Puzzle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 二进制状态压缩
 * @author Xinkang Wu
 * @date 2021/2/26 15:54
 */
public class Solution {

    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (String word : words) {
            int mask = 0;
            for (int i = 0; i < word.length(); ++i) {
                mask |= (1 << (word.charAt(i) - 'a'));
            }
            if (Integer.bitCount(mask) <= 7) {
                countMap.put(mask, countMap.getOrDefault(mask, 0) + 1);
            }
        }
        for (String puzzle : puzzles) {
            int num = 0, mask = 0;
            for (int i = 1; i < 7; ++i) {
                mask |= (1 << (puzzle.charAt(i) - 'a'));
            }
            int subset = mask;
            do {
                int s = subset | (1 << puzzle.charAt(0) - 'a');
                if (countMap.containsKey(s)) {
                    num += countMap.get(s);
                }
                subset = (subset - 1) & mask;
            } while (subset != mask);
            ans.add(num);
        }
        return ans;
    }
}
