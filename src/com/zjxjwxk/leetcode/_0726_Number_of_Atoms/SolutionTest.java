package com.zjxjwxk.leetcode._0726_Number_of_Atoms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countOfAtoms1() {
        String formula = "H2O";
        String ans = "H2O";
        assertEquals(ans, solution.countOfAtoms(formula));
    }

    @Test
    void countOfAtoms2() {
        String formula = "Mg(OH)2";
        String ans = "H2MgO2";
        assertEquals(ans, solution.countOfAtoms(formula));
    }

    @Test
    void countOfAtoms3() {
        String formula = "K4(ON(SO3)2)2";
        String ans = "K4N2O14S4";
        assertEquals(ans, solution.countOfAtoms(formula));
    }

    @Test
    void countOfAtoms4() {
        String formula = "Be32";
        String ans = "Be32";
        assertEquals(ans, solution.countOfAtoms(formula));
    }
}