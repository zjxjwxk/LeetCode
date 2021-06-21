package com.zjxjwxk.leetcode._1239_Maximum_Length_of_a_Concatenated_String_with_Unique_Characters;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯 + 位运算
 * @author Xinkang Wu
 * @date 2021/6/21 14:28
 */
public class Solution {

    private int ans;

    public int maxLength(List<String> arr) {
        ans = 0;
        List<Integer> maskList = new ArrayList<>();
        for (String str : arr) {
            int mask = strToMask(str);
            if (mask > 0) {
                maskList.add(mask);
            }
        }
        dfs(maskList, 0, 0);
        return ans;
    }

    private void dfs(List<Integer> maskList, int index, int mask) {
        if (index == maskList.size()) {
            ans = Math.max(ans, Integer.bitCount(mask));
            return;
        }
        if ((maskList.get(index) & mask) == 0) {
            dfs(maskList, index + 1, mask | maskList.get(index));
        }
        dfs(maskList, index + 1, mask);
    }

    private int strToMask(String str) {
        int mask = 0;
        for (int i = 0; i < str.length(); ++i) {
            int ch = str.charAt(i) - 'a';
            if (((mask >> ch) & 1) == 1) {
                return 0;
            }
            mask |= (1 << (str.charAt(i) - 'a'));
        }
        return mask;
    }
}
