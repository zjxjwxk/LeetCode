package com.zjxjwxk.leetcode._0318_Maximum_Product_of_Word_Lengths;

import java.util.HashMap;
import java.util.Map;

/**
 * 位运算+哈希表
 * @author Xinkang Wu
 * @date 2021/11/17 13:58
 */
public class Solution2 {

    public int maxProduct(String[] words) {
        Map<Integer, Integer> bitStrLenMap = new HashMap<>();
        for (String word : words) {
            int bit = 0;
            for (int j = 0; j < word.length(); ++j) {
                bit |= 1 << (word.charAt(j) - 'a');
            }
            bitStrLenMap.put(bit, Math.max(bitStrLenMap.getOrDefault(bit, 0), word.length()));
        }
        int maxProduct = 0;
        for (Map.Entry<Integer, Integer> entry1 : bitStrLenMap.entrySet()) {
            for (Map.Entry<Integer, Integer> entry2 : bitStrLenMap.entrySet()) {
                if ((entry1.getKey() & entry2.getKey()) == 0) {
                    maxProduct = Math.max(maxProduct, entry1.getValue() * entry2.getValue());
                }
            }
        }
        return maxProduct;
    }
}
