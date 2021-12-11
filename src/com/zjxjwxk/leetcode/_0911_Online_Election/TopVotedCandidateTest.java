package com.zjxjwxk.leetcode._0911_Online_Election;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopVotedCandidateTest {

    @Test
    void test() {
        int[] persons = {0, 1, 1, 0, 0, 1, 0};
        int[] times = {0, 5, 10, 15, 20, 25, 30};
        TopVotedCandidate topVotedCandidate = new TopVotedCandidate(persons, times);
        assertEquals(0, topVotedCandidate.q(3));
        assertEquals(1, topVotedCandidate.q(12));
        assertEquals(1, topVotedCandidate.q(25));
        assertEquals(0, topVotedCandidate.q(15));
        assertEquals(0, topVotedCandidate.q(24));
        assertEquals(1, topVotedCandidate.q(8));
    }
}