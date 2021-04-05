package com.zjxjwxk.leetcode._1006_Clumsy_Factorial;

/**
 * 栈
 * 时间复杂度O(n)
 * 空间复杂度O(n)
 * @author Xinkang Wu
 * @date 2021/4/5 16:48
 */
public class Solution {

    public int clumsy(int N) {
        int[] stack = new int[N];
        int index = -1, count = 0, ans = 0;
        stack[++index] = N--;
        while (N != 0) {
            int sign = count++ % 4;
            if (sign == 0 || sign == 1) {
                int top = stack[index--];
                stack[++index] = sign == 0 ? top * N : top / N;
            } else {
                stack[++index] = sign == 2 ? N : -N;
            }
            --N;
        }
        for (int i = 0; i <= index; ++i) {
            ans += stack[i];
        }
        return ans;
    }
}
