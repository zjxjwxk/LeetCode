package com.zjxjwxk.leetcode._0331_Verify_Preorder_Serialization_of_a_Binary_Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {

    private final Solution2 solution2 = new Solution2();

    @Test
    void isValidSerialization() {
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        assertTrue(solution2.isValidSerialization(preorder));
    }

    @Test
    void isValidSerialization2() {
        String preorder = "1,#";
        assertFalse(solution2.isValidSerialization(preorder));
    }

    @Test
    void isValidSerialization3() {
        String preorder = "9,#,#,1";
        assertFalse(solution2.isValidSerialization(preorder));
    }

    @Test
    void isValidSerialization4() {
        String preorder = "1";
        assertFalse(solution2.isValidSerialization(preorder));
    }

    @Test
    void isValidSerialization5() {
        String preorder = "1,2";
        assertFalse(solution2.isValidSerialization(preorder));
    }

    @Test
    void isValidSerialization6() {
        String preorder = "1,2";
        assertFalse(solution2.isValidSerialization(preorder));
    }

    @Test
    void isValidSerialization7() {
        String preorder = "#,#";
        assertFalse(solution2.isValidSerialization(preorder));
    }
}