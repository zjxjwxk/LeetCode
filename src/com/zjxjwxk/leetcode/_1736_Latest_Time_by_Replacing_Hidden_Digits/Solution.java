package com.zjxjwxk.leetcode._1736_Latest_Time_by_Replacing_Hidden_Digits;

/**
 * 贪心
 * @author Xinkang Wu
 * @date 2021/8/2 13:50
 */
public class Solution {

    public String maximumTime(String time) {
        char[] chArr = time.toCharArray();
        if (chArr[0] == '?') {
            if (chArr[1] == '?' || chArr[1] <= '3') {
                chArr[0] = '2';
            } else {
                chArr[0] = '1';
            }
        }
        if (chArr[1] == '?') {
            if (chArr[0] == '2') {
                chArr[1] = '3';
            } else {
                chArr[1] = '9';
            }
        }
        if (chArr[3] == '?') {
            chArr[3] = '5';
        }
        if (chArr[4] == '?') {
            chArr[4] = '9';
        }
        return new String(chArr);
    }
}
