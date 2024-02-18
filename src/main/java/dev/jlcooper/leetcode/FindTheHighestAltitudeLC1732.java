package dev.jlcooper.leetcode;

//Source:https://leetcode.com/problems/find-the-highest-altitude/
/*

There is a biker going on a road trip. The road trip consists of n + 1
points at different altitudes. The biker starts his trip on point 0 with
altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain
in altitude between points i and i + 1 for all (0 <= i < n).
Return the highest altitude of a point.

* */

import java.util.ArrayList;

public class FindTheHighestAltitudeLC1732 {


    int accumulator = 0;
    int highestAltitude = 0;

    public int largestAltitude(int[] altitudeGains) {

        for(int i = 0; i < altitudeGains.length; i++){
            accumulator += altitudeGains[i];

            if (accumulator > highestAltitude){
                highestAltitude = accumulator;
            }
        }


        return highestAltitude;
    }
}
