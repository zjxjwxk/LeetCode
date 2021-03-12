package com.zjxjwxk.leetcode._0331_Verify_Preorder_Serialization_of_a_Binary_Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isValidSerialization() {
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        assertTrue(solution.isValidSerialization(preorder));
    }

    @Test
    void isValidSerialization2() {
        String preorder = "1,#";
        assertFalse(solution.isValidSerialization(preorder));
    }

    @Test
    void isValidSerialization3() {
        String preorder = "9,#,#,1";
        assertFalse(solution.isValidSerialization(preorder));
    }

    @Test
    void isValidSerialization4() {
        String preorder = "1";
        assertFalse(solution.isValidSerialization(preorder));
    }

    @Test
    void isValidSerialization5() {
        String preorder = "1,2";
        assertFalse(solution.isValidSerialization(preorder));
    }

    @Test
    void isValidSerialization6() {
        String preorder = "1,2";
        assertFalse(solution.isValidSerialization(preorder));
    }
}