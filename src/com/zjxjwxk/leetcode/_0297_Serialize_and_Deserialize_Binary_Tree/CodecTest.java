package com.zjxjwxk.leetcode._0297_Serialize_and_Deserialize_Binary_Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodecTest {

    private final Codec codec = new Codec();

    @Test
    void deserialize() {
        String str = "1,2,3,2147483647,2147483647,4,5,2147483647,2147483647,2147483647,2147483647";
        Codec.TreeNode head = codec.deserialize(str);
        assertEquals(codec.serialize(head), str);
    }
}