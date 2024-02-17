package dev.jlcooper.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarray1LC643Test {

    MaximumAverageSubarray1LC643 solution;

    @BeforeEach
    public void before(){
        solution = new MaximumAverageSubarray1LC643();
    }

    @Test
    public void findMaxAverage_givenASimpleArrayWithAWindowSizeOf2ReturnTheMaximumAverage(){

        int[] array = {1,2,3,4,5};
        int windowSize = 2;
        double expectedAverage = 4.50000;

        System.out.println("solution.findMaxAverage(array,windowSize) = " + solution.findMaxAverage(array,windowSize));
        assertEquals(expectedAverage, solution.findMaxAverage(array,windowSize));

    }

    @Test
    public void findMaxAverage_givenAnArrayWithTheSameWindowSizeAsTheArrayReturnTheAverageOfAllTheNumbers(){

        int[] array = {1,2,3,4,5};
        int windowSize = 5;
        double expectedAverage = 3;

        System.out.println("solution.findMaxAverage(array,windowSize) = " + solution.findMaxAverage(array,windowSize));
        assertEquals(expectedAverage, solution.findMaxAverage(array,windowSize));

    }

    @Test
    public void findMaxAverage_givenAnArrayWithSomebullshit(){

        int[] array = {
                8860,-853,6534,4477,-4589,8646,-6155,-5577,-1656,-5779,-2619,-8604,-1358,-8009,
                4983,7063,3104,-1560,4080,2763,5616,-2375,2848,1394,-7173,-5225,-8244,-809,8025,-4072,
                -4391,-9579,1407,6700,2421,-6685,5481,-1732,-8892,-6645,3077,3287,-4149,8701,-4393,-9070,
                -1777,2237,-3253,-506,-4931,-7366,-8132,5406,-6300,-275,-1908,67,3569,1433,-7262,-437,
                8303,4498,-379,3054,-6285,4203,6908,4433,3077,2288,9733,-8067,3007,9725,9669,1362,-2561,
                -4225,5442,-9006,-429,160,-9234,-4444,3586,-5711,-9506,-79,-4418,-4348,-5891
        };
        int windowSize = 93;
        double expectedAverage = -594.5806451612904;

//        System.out.println("solution.findMaxAverage(array,windowSize) = " + solution.findMaxAverage(array,windowSize));
        assertEquals(expectedAverage, solution.findMaxAverage(array,windowSize));

    }
}