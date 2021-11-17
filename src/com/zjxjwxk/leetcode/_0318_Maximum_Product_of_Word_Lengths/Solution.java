package com.zjxjwxk.leetcode._0318_Maximum_Product_of_Word_Lengths;

/**
 * 位运算
 * @author Xinkang Wu
 * @date 2021/11/17 13:58
 */
public class Solution {

    public int maxProduct(String[] words) {
        int len = words.length, maxProduct = 0;
        int[] bits = new int[len];
        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < words[i].length(); ++j) {
                bits[i] |= (1 << (words[i].charAt(j) - 'a'));
            }
        }
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                if ((bits[i] & bits[j]) == 0) {
                    maxProduct = Math.max(maxProduct, words[i].length() * words[j].length());
                }
            }
        }
        return maxProduct;
    }
}
