package com.zjxjwxk.leetcode._0721_Accounts_Merge;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void accountsMerge() {
        List<List<String>> accounts = DSFactory.newArrayList(new String[][]{
                {"John", "johnsmith@mail.com", "john00@mail.com"},
                {"John", "johnnybravo@mail.com"},
                {"John", "johnsmith@mail.com", "john_newyork@mail.com"},
                {"Mary", "mary@mail.com"}
        });
        System.out.println(solution.accountsMerge(accounts));
    }
}