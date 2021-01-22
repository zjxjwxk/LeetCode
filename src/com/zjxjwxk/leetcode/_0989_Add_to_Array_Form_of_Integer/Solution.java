package com.zjxjwxk.leetcode._0989_Add_to_Array_Form_of_Integer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 逐位相加
 * @author Xinkang Wu
 * @date 2021/1/23 00:15
 */
public class Solution {

    public List<Integer> addToArrayForm(int[] A, int K) {
        int len = A.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = len - 1; i >= 0; --i) {
            A[i] += K % 10;
            K /= 10;
            if (A[i] >= 10) {
                ++K;
                A[i] -= 10;
            }
            ans.add(A[i]);
        }
        while (K != 0) {
            ans.add(K % 10);
            K /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
