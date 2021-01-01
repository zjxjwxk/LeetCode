package com.zjxjwxk.leetcode._0605_Can_Place_Flowers;

/**
 * 模拟
 * @author Xinkang Wu
 * @date 2021/1/1 16:33
 */
public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length, i = 0;
        if (flowerbed[i] == 0 && (len == 1 || flowerbed[i + 1] == 0)) {
            flowerbed[i] = 1;
            i += 2;
            --n;
        } else {
            ++i;
        }
        while (i < len - 1 && n > 0) {
            if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                i += 2;
                --n;
            } else {
                ++i;
            }
        }
        if (len > 2 && flowerbed[len - 1] == 0 && flowerbed[len - 2] == 0) {
            --n;
        }
        return n <= 0;
    }
}
