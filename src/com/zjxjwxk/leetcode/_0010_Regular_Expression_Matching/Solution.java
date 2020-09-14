package com.zjxjwxk.leetcode._0010_Regular_Expression_Matching;

/**
 * @author Xinkang Wu
 * @date 2020/9/12 9:10 上午
 */
public class Solution {

    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        return isMatchRecursively(s, 0, p, 0);
    }

    private boolean isMatchRecursively(String s, int sIndex, String p, int pIndex) {
        int sLen = s.length(), pLen = p.length();
        if (pIndex == pLen) {
            return sIndex == sLen;
        }
        if (pIndex < pLen - 1 && p.charAt(pIndex + 1) == '*') {
            if (sIndex == sLen || (s.charAt(sIndex) != p.charAt(pIndex) && p.charAt(pIndex) != '.')) {
                return isMatchRecursively(s, sIndex, p, pIndex + 2);
            } else {
                return isMatchRecursively(s, sIndex + 1, p, pIndex + 2)
                        || isMatchRecursively(s, sIndex + 1, p, pIndex)
                        || isMatchRecursively(s, sIndex, p, pIndex + 2);
            }
        }
        if (sIndex < sLen && (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '.')) {
            return isMatchRecursively(s, sIndex + 1, p, pIndex + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isMatch("aa", "a"));
        System.out.println(solution.isMatch("aa", "a*"));
        System.out.println(solution.isMatch("ab", ".*"));
        System.out.println(solution.isMatch("aab", "c*a*b"));
        System.out.println(solution.isMatch("mississippi", "mis*is*p*."));
        System.out.println(solution.isMatch("mississippi", "mis*is*ip*."));
        System.out.println(solution.isMatch("a", "aa"));
        System.out.println(solution.isMatch("a", "ab*"));
        System.out.println(solution.isMatch("a", ".*..a*"));
    }
}