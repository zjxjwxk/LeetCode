package com.zjxjwxk.leetcode._0748_Shortest_Completing_Word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void shortestCompletingWord1() {
        String licensePlate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};
        String ans = "steps";
        assertEquals(ans, solution.shortestCompletingWord(licensePlate, words));
    }

    @Test
    void shortestCompletingWord2() {
        String licensePlate = "1s3 456";
        String[] words = {"looks", "pest", "stew", "show"};
        String ans = "pest";
        assertEquals(ans, solution.shortestCompletingWord(licensePlate, words));
    }

    @Test
    void shortestCompletingWord3() {
        String licensePlate = "Ah71752";
        String[] words = {"suggest", "letter", "of", "husband", "easy", "education", "drug", "prevent", "writer", "old"};
        String ans = "husband";
        assertEquals(ans, solution.shortestCompletingWord(licensePlate, words));
    }

    @Test
    void shortestCompletingWord4() {
        String licensePlate = "OgEu755";
        String[] words = {"enough", "these", "play", "wide", "wonder", "box", "arrive", "money", "tax", "thus"};
        String ans = "enough";
        assertEquals(ans, solution.shortestCompletingWord(licensePlate, words));
    }

    @Test
    void shortestCompletingWord5() {
        String licensePlate = "iMSlpe4";
        String[] words = {"claim", "consumer", "student", "camera", "public", "never", "wonder", "simple", "thought", "use"};
        String ans = "simple";
        assertEquals(ans, solution.shortestCompletingWord(licensePlate, words));
    }
}