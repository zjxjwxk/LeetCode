package com.zjxjwxk.leetcode._0067_Add_Binary;

/**
 * @author zjxjwxk
 */
public class Solution {

    public String addBinary(String a, String b) {
        int index1 = a.length() - 1;
        int index2 = b.length() - 1;
        StringBuilder ret = new StringBuilder();
        int carry = 0;
        while (index1 >= 0 && index2 >= 0) {
            carry += a.charAt(index1--) - '0';
            carry += (int) b.charAt(index2--) - '0';
            ret.insert(0, (char) (carry % 2 + '0'));
            carry /= 2;
        }
        while (index1 >= 0) {
            carry += a.charAt(index1--) - '0';
            ret.insert(0, (char) (carry % 2 + '0'));
            carry /= 2;
        }
        while (index2 >= 0) {
            carry += b.charAt(index2--) - '0';
            ret.insert(0, (char) (carry % 2 + '0'));
            carry /= 2;
        }
        if (carry == 1) {
            ret.insert(0, '1');
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("1010", "1011"));
    }
}
