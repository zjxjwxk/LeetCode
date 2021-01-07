package com.zjxjwxk.leetcode._0990_Satisfiability_of_Equality_Equations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void equationsPossible1() {
        String[] equations = {"b==a", "a==b"};
        assertTrue(solution.equationsPossible(equations));
    }

    @Test
    void equationsPossible2() {
        String[] equations = {"a==b", "b==c", "a==c"};
        assertTrue(solution.equationsPossible(equations));
    }

    @Test
    void equationsPossible3() {
        String[] equations = {"a==b", "b!=c", "c==a"};
        assertFalse(solution.equationsPossible(equations));
    }

    @Test
    void equationsPossible4() {
        String[] equations = {"c==c", "b==d", "x!=z"};
        assertTrue(solution.equationsPossible(equations));
    }
}