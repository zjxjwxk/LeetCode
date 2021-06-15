package com.zjxjwxk.leetcode._1449_Form_Largest_Integer_With_Digits_That_Add_up_to_Target;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void largestNumber1() {
        int[] cost = {4, 3, 2, 5, 6, 7, 2, 5, 5};
        int target = 9;
        String ans = "7772";
        assertEquals(ans, solution2.largestNumber(cost, target));
    }

    @Test
    void largestNumber2() {
        int[] cost = {7, 6, 5, 5, 5, 6, 8, 7, 8};
        int target = 12;
        String ans = "85";
        assertEquals(ans, solution2.largestNumber(cost, target));
    }

    @Test
    void largestNumber3() {
        int[] cost = {2, 4, 6, 2, 4, 6, 4, 4, 4};
        int target = 5;
        String ans = "0";
        assertEquals(ans, solution2.largestNumber(cost, target));
    }

    @Test
    void largestNumber4() {
        int[] cost = {6, 10, 15, 40, 40, 40, 40, 40, 40};
        int target = 47;
        String ans = "32211";
        assertEquals(ans, solution2.largestNumber(cost, target));
    }
}