package com.zjxjwxk.leetcode._1002_Find_Common_Characters;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjxjwxk
 * @date 2020/10/14 9:05 上午
 */
public class Solution {

    private final int[] hashTable = new int[26];

    public List<String> commonChars(String[] A) {
        int arrLen = A.length;
        for (int i = 0; i < arrLen; ++i) {
            int strLen = A[i].length();
            int[] tempHashTable = new int[26];
            for (int j = 0; j < strLen; ++j) {
                int index = A[i].charAt(j) - 'a';
                ++tempHashTable[index];
            }
            if (i == 0) {
                System.arraycopy(tempHashTable, 0, hashTable, 0, 26);
            } else {
                for (int j = 0; j < 26; ++j) {
                    if (tempHashTable[j] < hashTable[j]) {
                        hashTable[j] = tempHashTable[j];
                    }
                }
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < hashTable[i]; ++j) {
                ans.add(String.valueOf((char) ('a' + i)));
            }
        }
        return ans;
    }
}
