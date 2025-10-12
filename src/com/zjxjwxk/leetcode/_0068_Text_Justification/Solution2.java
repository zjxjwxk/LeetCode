package com.zjxjwxk.leetcode._0068_Text_Justification;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟2
 *
 * @author Xinkang Wu
 * @date 2025/10/13 01:23
 */
public class Solution2 {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int len = words.length, i = 0, j = 0;
        while (i < len) {
            // 计算当前行的单词个数
            int width = 0, count = 0;
            StringBuilder sb = new StringBuilder();
            while (j < len && width < maxWidth) {
                int appendLen = (count > 0 ? 1 : 0) + words[j].length();
                if (width + appendLen <= maxWidth) {
                    width += appendLen;
                    ++count;
                    ++j;
                } else {
                    break;
                }
            }
            sb.append(words[i++]);
            if (count == 1) {
                // 只有一个单词，直接在末尾补齐空格
                appendSpace(sb, maxWidth - width);
            } else {
                // 有多个单词，在后续单词前添加空格
                if (j < len) {
                    // 当前不为最后一行，需计算后续每个单词前的空格数
                    // 总空格数
                    int spaceNum = maxWidth - width + (count - 1);
                    // 后续每个单词前平均添加的空格数
                    int avgSpaceNum = spaceNum / (count - 1);
                    // 后续左侧单词前需额外添加的空格数
                    int extraSpaceNum = spaceNum % (count - 1);
                    // 逐个拼接空格和单词
                    while (i < j) {
                        int appendSpaceNum = avgSpaceNum;
                        if (extraSpaceNum > 0) {
                            ++appendSpaceNum;
                            --extraSpaceNum;
                        }
                        appendSpace(sb, appendSpaceNum);
                        sb.append(words[i++]);
                    }
                } else {
                    // 当前为最后一行，直接在后续每个单词前添加一个空格
                    while (i < j) {
                        sb.append(' ');
                        sb.append(words[i++]);
                    }
                    // 在末尾补齐空格
                    appendSpace(sb, maxWidth - width);
                }
            }
            ans.add(sb.toString());
        }
        return ans;
    }

    /**
     * 在StringBuilder对象末尾添加空格
     *
     * @param sb 被添加空格的StringBuilder对象
     * @param num 添加的空格数
     */
    private void appendSpace(StringBuilder sb, int num) {
        for (int i = 0; i < num; ++i) {
            sb.append(' ');
        }
    }
}
