package com.zjxjwxk.leetcode._1078_Occurrences_After_Bigram;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xinkang Wu
 * @date 2021/12/26 17:07
 */
public class Solution {

    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> ans = new ArrayList<>();
        int len = words.length;
        if (len < 3) {
            return ans.toArray(new String[0]);
        }
        for (int i = 2; i < len; ++i) {
            if (first.equals(words[i - 2]) && second.equals(words[i - 1])) {
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);
    }
}
