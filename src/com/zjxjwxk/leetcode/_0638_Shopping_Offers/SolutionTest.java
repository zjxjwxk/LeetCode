package com.zjxjwxk.leetcode._0638_Shopping_Offers;

import com.zjxjwxk.leetcode.util.DSFactory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void shoppingOffers1() {
        List<Integer> price = Arrays.asList(2, 5);
        List<List<Integer>> special = DSFactory.newArrayList(new Integer[][]{
                {3, 0, 5}, {1, 2, 10}
        });
        List<Integer> needs = Arrays.asList(3, 2);
        int ans = 14;
        assertEquals(ans, solution.shoppingOffers(price, special, needs));
    }

    @Test
    void shoppingOffers2() {
        List<Integer> price = Arrays.asList(2, 3, 4);
        List<List<Integer>> special = DSFactory.newArrayList(new Integer[][]{
                {1, 1, 0, 4}, {2, 2, 1, 9}
        });
        List<Integer> needs = Arrays.asList(1, 2, 1);
        int ans = 11;
        assertEquals(ans, solution.shoppingOffers(price, special, needs));
    }
}