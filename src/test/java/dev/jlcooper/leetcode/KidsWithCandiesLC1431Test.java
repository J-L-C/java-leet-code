package dev.jlcooper.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class KidsWithCandiesLC1431Test {

    KidsWithCandiesLC1431 solution;

    @BeforeEach
    public void before(){
        solution = new KidsWithCandiesLC1431();
    }


    @Test
    public void kidsWithCandies_returnTrueIfThereThreeKidsAreTiedForMostCandies(){

        int[] candies = {1,1,1};
        int extraCandies = 1;

        List<Boolean> expected = new ArrayList<>(Arrays.asList(true,true,true));
        List<Boolean> actual = solution.kidsWithCandies(candies,extraCandies);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void kidsWithCandies_returnTFTTFTbasedOnEachKidAndTheirCandyCollection(){

        int[] candies = {3,0,2,4,0,5};
        int extraCandies = 3;

        List<Boolean> expected = new ArrayList<>(Arrays.asList(true,false,true,true,false,true));
        List<Boolean> actual = solution.kidsWithCandies(candies,extraCandies);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void kidsWithCandies_kidWithTheMostCandiesStaysWithTheMostCandies(){

        int[] candies = {13,3,5,4,5,6};
        int extraCandies = 3;

        List<Boolean> expected = new ArrayList<>(Arrays.asList(true,false,false,false,false,false));
        List<Boolean> actual = solution.kidsWithCandies(candies,extraCandies);

        Assertions.assertEquals(expected,actual);

    }

}