package com.zjxjwxk.leetcode._0605_Can_Place_Flowers;

/**
 * 数学计算
 * @author Xinkang Wu
 * @date 2021/1/1 21:24
 */
public class Solution2 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length, preIndex = -1, count = 0;
        for (int i = 0; i < len; ++i) {
            if (flowerbed[i] == 1) {
                if (preIndex == -1) {
                    count += (i >> 1);
                } else {
                    count += ((i - preIndex - 2) >> 1);
                }
                preIndex = i;
                if (count >= n) {
                    return true;
                }
            }
        }
        if (preIndex == -1) {
            count += ((len + 1) >> 1);
        } else {
            count += ((len - preIndex - 1) >> 1);
        }
        return count >= n;
    }
}
