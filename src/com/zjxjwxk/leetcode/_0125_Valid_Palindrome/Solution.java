package com.zjxjwxk.leetcode._0125_Valid_Palindrome;

/**
 * 双指针
 *
 * @author Xinkang Wu
 * @date 2025/10/13 20:33
 */
public class Solution {

    public boolean isPalindrome(String s) {
        int len = s.length(), i = 0, j = len - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                ++i;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                --j;
            }
            if (i < j && Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
                return false;
            }
        }
        return true;
    }
}
