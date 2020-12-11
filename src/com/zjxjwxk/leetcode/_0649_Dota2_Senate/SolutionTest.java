package com.zjxjwxk.leetcode._0649_Dota2_Senate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void predictPartyVictory1() {
        String senate = "RD";
        String ans = "Radiant";
        assertEquals(ans, solution.predictPartyVictory(senate));
    }

    @Test
    void predictPartyVictory2() {
        String senate = "RDD";
        String ans = "Dire";
        assertEquals(ans, solution.predictPartyVictory(senate));
    }

    @Test
    void predictPartyVictory3() {
        String senate = "DRRDRDRDRDDRDRDR";
        String ans = "Radiant";
        assertEquals(ans, solution.predictPartyVictory(senate));
    }
}