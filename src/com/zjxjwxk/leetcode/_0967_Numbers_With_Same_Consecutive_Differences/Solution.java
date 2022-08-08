package com.zjxjwxk.leetcode._0967_Numbers_With_Same_Consecutive_Differences;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjxjwxk
 * @date 2022/8/8 21:48
 */
public class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; ++i) {
            backtrack(list, i, n - 1, k);
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    private void backtrack(List<Integer> list, int num, int n, int k) {
        if (n == 0) {
            list.add(num);
            return;
        }
        int digit = num % 10;
        if (digit >= k) {
            backtrack(list, num * 10 + digit - k, n - 1, k);
        }
        if (digit + k < 10 && k != 0) {
            backtrack(list, num * 10 + digit + k, n - 1, k);
        }
    }
}
