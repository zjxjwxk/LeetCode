package com.zjxjwxk.leetcode._0556_Next_Greater_Element_III;

import java.util.ArrayList;
import java.util.List;

/**
 * 线性解法
 * @author Xinkang Wu
 * @date 2021/3/6 16:48
 */
public class Solution {

    public int nextGreaterElement(int n) {
        int temp = n, digit = -1;
        List<Integer> numList = new ArrayList<>();
        while (temp != 0) {
            digit = temp % 10;
            if (numList.isEmpty() || digit >= numList.get(numList.size() - 1)) {
                numList.add(digit);
            } else {
                break;
            }
            temp /= 10;
        }
        if (temp == 0) {
            return -1;
        }
        for (int i = 0; i < numList.size(); ++i) {
            int num = numList.get(i);
            if (digit < num) {
                numList.set(i, digit);
                digit = num;
                break;
            }
        }
        temp /= 10;
        temp = temp * 10 + digit;
        for (int num : numList) {
            if (temp > ((Integer.MAX_VALUE - num) / 10)) {
                return -1;
            }
            temp = temp * 10 + num;
        }
        return temp;
    }
}
