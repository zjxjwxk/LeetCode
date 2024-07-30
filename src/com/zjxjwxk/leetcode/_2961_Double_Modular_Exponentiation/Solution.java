package com.zjxjwxk.leetcode._2961_Double_Modular_Exponentiation;

import java.util.ArrayList;
import java.util.List;

/**
 * 快速幂
 * @author Xinkang Wu
 * @date 2024/7/30 23:02
 */
public class Solution {

    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < variables.length; ++i) {
            int a = variables[i][0], b = variables[i][1], c = variables[i][2], m = variables[i][3];
            int res = pow(a % 10, b, 10);
            res = pow(res % m, c, m);
            if (res == target) {
                ans.add(i);
            }
        }
        return ans;
    }

    private int pow(int x, int n, int mod) {
        int res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * x % mod;
            }
            x = x * x % mod;
            n >>= 1;
        }
        return res;
    }
}
