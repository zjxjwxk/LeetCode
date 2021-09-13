package com.zjxjwxk.leetcode._0345_Reverse_Vowels_of_a_String;

/**
 * 双指针
 * @author Xinkang Wu
 * @date 2021/9/13 14:13
 */
public class Solution {

    public String reverseVowels(String s) {
        char[] chArr = s.toCharArray();
        int i = 0, j = chArr.length - 1;
        while (i < j) {
            while (i < j && !isVowel(chArr[i])) {
                ++i;
            }
            while (i < j && !isVowel(chArr[j])) {
                --j;
            }
            swap(chArr, i++, j--);
        }
        return new String(chArr);
    }

    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }

    private void swap(char[] chArr, int index1, int index2) {
        char temp = chArr[index1];
        chArr[index1] = chArr[index2];
        chArr[index2] = temp;
    }
}
