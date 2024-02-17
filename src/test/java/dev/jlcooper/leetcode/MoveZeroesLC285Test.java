package dev.jlcooper.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MoveZeroesLC285Test {

    MoveZeroesLC285 solution;

    @BeforeEach
    public void before(){
        solution = new MoveZeroesLC285();
    }

    @Test
    void moveZeroes_withAnArrayOfTwoNumbers_0_5_moveTheFiveToThe0thIndex() {

        int[] values = {0,5};
        int[] expected = {5,0};

        solution.moveZeroes(values);
        assertArrayEquals(expected, values);
    }

    @Test
    void moveZeroes_withAnArrayConfigureWithARoughBalanceOfZerosAndValuesHaveTheZerosAccumulateAtTheEnd() {

        int[] values = {1,5,0,0,0,0,5,10,19,1934,900,423,0,1423,0,0,1};
        int[] expected = {1,5,5,10,19,1934,900,423,1423,1,0,0,0,0,0,0,0};

        solution.moveZeroes(values);
        assertArrayEquals(expected, values);
    }


    @Test
    void moveZeroes_withAnArrayOfPositiveAndNegativeValuesHaveTheZerosAccumulateAtTheEnd() {

        int[] values = {1,5,0,0,0,0,-5,10,19,1934,-900,423,0,-1423,0,0,1};
        int[] expected = {1,5,-5,10,19,1934,-900,423,-1423,1,0,0,0,0,0,0,0};

        solution.moveZeroes(values);
        assertArrayEquals(expected, values);
    }
}