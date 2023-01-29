package com.javalab.tutorial.fuzzywuzzy;

import me.xdrop.fuzzywuzzy.FuzzySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuzzyWuzzyTest {

    private final String input = "Java Developer";

    @Test
    public void givenInputStrings_whenCheckingSimpleRatio_thenItShouldWorkCorrectly() {
        assertTrue(FuzzySearch.ratio(input, "Developer") < 100);
    }

    @Test
    public void givenInputStrings_whenCheckingPartialRatio_thenItShouldWorkCorrectly() {
        assertEquals(FuzzySearch.partialRatio(input, "Developer"), 100);
    }

    @Test
    public void givenInputStrings_whenCheckingSortSimpleRatio_thenItShouldWorkCorrectly() {
        assertEquals(FuzzySearch.tokenSortRatio(input, "Developer Java"), 100);
    }
}