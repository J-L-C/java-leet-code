package dev.jlcooper.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheHighestAltitudeLC1732Test {

    FindTheHighestAltitudeLC1732 solution;

    @BeforeEach
    public void before(){

        solution = new FindTheHighestAltitudeLC1732();
    }


    @Test
    public void largestAltitude_startingAtAltitudeZeroAndOnlyGoingUpToOnceAltitude5WillBeTheResult(){

        int[] altitudeGains = {5};
        int expectedHighestPoint = 5;

        assertEquals(expectedHighestPoint, solution.largestAltitude(altitudeGains));
    }


    @Test
    public void largestAltitude_startingAtAltitudeZeroDownBy5AndThenUp5WillReturn0(){

        int[] altitudeGains = {-5,5};
        int expectedHighestPoint = 0;

        assertEquals(expectedHighestPoint, solution.largestAltitude(altitudeGains));
    }


    @Test
    public void largestAltitude_startingAtAltitudeZeroAndMovingUpAndDownABumpHillReturn1AsThisIsTheHighest(){

        int[] altitudeGains = {-5,1,5,0,-7};
        int expectedHighestPoint = 1;

        assertEquals(expectedHighestPoint, solution.largestAltitude(altitudeGains));
    }

    @Test
    public void largestAltitude_startingAtAltitudeZeroAndMovingSticklyDown0ShouldBeTheHighestAltitude(){

        int[] altitudeGains = {-5,-1,-5,0,-7,-90,-45464};
        int expectedHighestPoint = 0;

        assertEquals(expectedHighestPoint, solution.largestAltitude(altitudeGains));
    }

}