package com.zjxjwxk.leetcode._0397_Integer_Replacement;

import java.util.HashMap;
import java.util.Map;

/**
 * 记忆化搜索
 * 时间复杂度O(logn)
 * 空间复杂度O(logn)
 * @author Xinkang Wu
 * @date 2021/11/19 13:31
 */
public class Solution {

    public int integerReplacement(int n) {
        return backtrack(n, new HashMap<>());
    }

    private int backtrack(int cur, Map<Integer, Integer> dp) {
        Integer needStep = dp.get(cur);
        if (needStep != null) {
            return needStep;
        }
        if (cur == 1) {
            return 0;
        }
        if ((cur & 1) == 0) {
            needStep = backtrack(cur >> 1, dp) + 1;
        } else {
            needStep = Math.min(backtrack(cur >> 1, dp), backtrack((cur >> 1) + 1, dp)) + 2;
        }
        dp.put(cur, needStep);
        return needStep;
    }
}
