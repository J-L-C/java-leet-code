package dev.jlcooper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution dev.jlcooper;

    @BeforeEach
    public void setup(){
        dev.jlcooper = new Solution();
    }

    @Test
    public void placeholder(){
        Object expected = null;

        Object actual = dev.jlcooper.solve();

        Assertions.assertEquals(actual,expected);
    }
}