package com.zjxjwxk.leetcode._0068_Text_Justification;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟
 * @author Xinkang Wu
 * @date 2021/9/9 11:00
 */
public class Solution {

    public List<String> fullJustify(String[] words, int maxWidth) {
        int len = words.length, i = 0, j = 0;
        List<String> ans = new ArrayList<>();
        while (j < len) {
            int width = 0;
            while (j < len && width + words[j].length() <= maxWidth && (j == i || (width + 1 + words[j].length() <= maxWidth))) {
                if (j > i) {
                    ++width;
                }
                width += words[j].length();
                ++j;
            }
            StringBuilder sb = new StringBuilder();
            int extraSpace = maxWidth - width;
            if (j < len) {
                int addSpace = 0, singleSpace = 0;
                if (j - i > 1) {
                    addSpace = extraSpace / (j - i - 1);
                    singleSpace = extraSpace % (j - i - 1);
                }
                sb.append(words[i]);
                for (int k = i + 1; k < j; ++k) {
                    sb.append(' ');
                    if (extraSpace > 0) {
                        if (singleSpace > 0) {
                            sb.append(' ');
                            --singleSpace;
                            --extraSpace;
                        }
                        sb.append(getBlankStr(addSpace));
                        extraSpace -= addSpace;
                    }
                    sb.append(words[k]);
                }
            } else {
                sb.append(words[i]);
                for (int k = i + 1; k < j; ++k) {
                    sb.append(' ').append(words[k]);
                }
            }
            sb.append(getBlankStr(extraSpace));
            ans.add(sb.toString());
            i = j;
        }
        return ans;
    }

    private String getBlankStr(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            sb.append(' ');
        }
        return sb.toString();
    }
}
