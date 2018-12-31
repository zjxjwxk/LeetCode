package com.zjxjwxk.leetcode._058_Length_of_Last_Word;

/**
 * @author zjxjwxk
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        int len = s.length();
        int count = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (count != 0) {
                    return count;
                }
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("a "));
    }
}
