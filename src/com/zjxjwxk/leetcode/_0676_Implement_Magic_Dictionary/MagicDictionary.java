package com.zjxjwxk.leetcode._0676_Implement_Magic_Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Xinkang Wu
 * @date 2024/8/12 21:34
 */
public class MagicDictionary {

    private final Map<Integer, List<String>> lenWordListMap;

    public MagicDictionary() {
        this.lenWordListMap = new HashMap<>();
    }

    public void buildDict(String[] dictionary) {
        for (String word : dictionary) {
            int len = word.length();
            List<String> wordList = this.lenWordListMap.get(len);
            if (wordList == null) {
                wordList = new ArrayList<>();
            }
            wordList.add(word);
            this.lenWordListMap.put(len, wordList);
        }
    }

    public boolean search(String searchWord) {
        int len = searchWord.length();
        List<String> wordList = this.lenWordListMap.get(len);
        if (wordList == null) {
            return false;
        }
        for (String word : wordList) {
            int diffCount = 0;
            for (int i = 0; i < len; ++i) {
                if (word.charAt(i) != searchWord.charAt(i)) {
                    ++diffCount;
                }
                if (diffCount > 1) {
                    break;
                }
            }
            if (diffCount == 1) {
                return true;
            }
        }
        return false;
    }
}
