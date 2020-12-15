package com.zjxjwxk.leetcode._0738_Monotone_Increasing_Digits;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2020/12/15 12:33
 * 12346632
 */
public class Solution {

    public int monotoneIncreasingDigits(int N) {
        int[] digits = new int[10];
        int index = 9;
        while (N != 0) {
            digits[index--] = N % 10;
            N /= 10;
        }
        index = 0;
        while (digits[index] == 0) {
            ++index;
        }
        for (int i = index + 1; i < digits.length; ++i) {
            if (digits[i] < digits[i - 1]) {
                int preIndex = i - 1;
                while (preIndex > 0 && digits[preIndex] == digits[preIndex - 1]) {
                    --preIndex;
                }
                --digits[preIndex];
                for (int j = preIndex + 1; j < digits.length; ++j) {
                    digits[j] = 9;
                }
                break;
            }
        }
        int ans = digits[index];
        for (int i = index + 1; i < digits.length; ++i) {
            ans = ans * 10 + digits[i];
        }
        return ans;
    }
}
