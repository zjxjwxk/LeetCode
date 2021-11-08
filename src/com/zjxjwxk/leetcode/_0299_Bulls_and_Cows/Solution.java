package com.zjxjwxk.leetcode._0299_Bulls_and_Cows;

/**
 * 遍历
 * @author Xinkang Wu
 * @date 2021/11/8 13:06
 */
public class Solution {

    public String getHint(String secret, String guess) {
        char[] secretChars = secret.toCharArray();
        char[] guessChars = guess.toCharArray();
        int[] secretCounts = new int[10];
        int[] guessCounts = new int[10];
        int bulls = 0, cows = 0;
        for (int i = 0; i < guessChars.length; ++i) {
            char guessCh = guessChars[i];
            char secretCh = secretChars[i];
            if (guessCh == secretCh) {
                ++bulls;
            } else {
                ++secretCounts[secretCh - '0'];
                ++guessCounts[guessCh - '0'];
            }
        }
        for (int i = 0; i <= 9; ++i) {
            cows += Math.min(secretCounts[i], guessCounts[i]);
        }
        return bulls + "A" + cows + "B";
    }
}
