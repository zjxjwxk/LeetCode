package com.zjxjwxk.leetcode.LCP_19_Autumn_Leaves_Collection;

/**
 * @author zjxjwxk
 * @date 2020/10/1 11:35 下午
 */
public class Solution2 {

    public int minimumOperations(String leaves) {
        int len = leaves.length();
        int pre1 = leaves.charAt(0) == 'r' ? 0 : 1;
        int pre2 = Integer.MAX_VALUE;
        int pre3 = Integer.MAX_VALUE;
        int cur1, cur2, cur3 = 0;
        for (int i = 1; i < len; ++i) {
            int isRed = leaves.charAt(i) == 'r' ? 1 : 0;
            int isYellow = leaves.charAt(i) == 'y' ? 1 : 0;
            cur1 = pre1 + isYellow;
            cur2 = Math.min(pre1, pre2) + isRed;
            if (i == 1) {
                cur3 = Integer.MAX_VALUE;
            } else {
                cur3 = Math.min(pre2, pre3) + isYellow;
            }
            pre1 = cur1;
            pre2 = cur2;
            pre3 = cur3;
        }
        return cur3;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minimumOperations("rrryyyrryyyrr"));
        System.out.println(solution.minimumOperations("ryr"));
    }
}
