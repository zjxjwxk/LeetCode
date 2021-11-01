package com.zjxjwxk.leetcode._0500_Keyboard_Row;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2021/10/31 20:20
 */
public class Solution {

    public String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();
        String rowIndexes = "12210111011122000010020202";
        for (String word : words) {
            boolean sameRow = true;
            char index = rowIndexes.charAt(Character.toLowerCase(word.charAt(0)) - 'a');
            for (int i = 1; i < word.length(); ++i) {
                if (rowIndexes.charAt(Character.toLowerCase(word.charAt(i)) - 'a') != index) {
                    sameRow = false;
                    break;
                }
            }
            if (sameRow) {
                ans.add(word);
            }
        }
        return ans.toArray(new String[0]);
    }
}
