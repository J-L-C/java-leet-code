package dev.jlcooper.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CanPlaceFlowerLC605Test {

    CanPlaceFlowerLC605 solution;

    @BeforeEach
    public void before(){
        solution = new CanPlaceFlowerLC605();
    }


    @Test
    public void canPlaceFlower_givenAFlowerbedWithNoFlowerPlantsItDoesNotViolateNoAdjacentFlowersRule(){

        int[] flowerbed = {0,0,0};
        int flowersToPlant = 1;

        Assertions.assertEquals(true,solution.canPlaceFlowers(flowerbed,flowersToPlant));
    }

    @Test
    public void canPlaceFlower_givenAFlowerbedFilledItViolateNoAdjacentFlowersRule(){

        int[] flowerbed = {1,1,1};
        int flowersToPlant = 1;

        Assertions.assertEquals(false,solution.canPlaceFlowers(flowerbed,flowersToPlant));
    }


    @Test
    public void canPlaceFlower_givenAFlowerbedWithTheFirstAndLastPlotFillerButPlentyOfRoomInTheCenterReturnTrue(){

        int[] flowerbed = {1,0,0,0,0,0,1};
        int flowersToPlant = 1;

        Assertions.assertEquals(true,solution.canPlaceFlowers(flowerbed,flowersToPlant));
    }

    @Test
    public void canPlaceFlower_withASmallFlowerbedOfSize2AndEmptyReturnTrueWhenPlantingOneFlower(){

        int[] flowerbed = {0,0};
        int flowersToPlant = 1;

        Assertions.assertEquals(true,solution.canPlaceFlowers(flowerbed,flowersToPlant));
    }

    @Test
    public void canPlaceFlower_withASmallFlowerbedOfSize2AndFirstPlotFillerReturnFalseWhenPlantingOneFlower(){

        int[] flowerbed = {1,0};
        int flowersToPlant = 1;

        Assertions.assertEquals(false,solution.canPlaceFlowers(flowerbed,flowersToPlant));
    }


    @Test
    public void canPlaceFlower_withASmallFlowerbedOfSize2AndLastPlotFillerReturnFalseWhenPlantingOneFlower(){

        int[] flowerbed = {0,1};
        int flowersToPlant = 1;

        Assertions.assertEquals(false,solution.canPlaceFlowers(flowerbed,flowersToPlant));
    }


    @Test
    public void canPlaceFlower_withASmallFlowerbedOfSize1AndNotFilledReturnTrueWhenPlantingOneFlower(){

        int[] flowerbed = {0};
        int flowersToPlant = 1;

        Assertions.assertEquals(true,solution.canPlaceFlowers(flowerbed,flowersToPlant));
    }


    @Test
    public void canPlaceFlower_flowerbedConfiguredAs010000AndNIs2ReturnTrue(){

        int[] flowerbed = {0,1,0,0,0,0};
        int flowersToPlant = 2;

        Assertions.assertEquals(true,solution.canPlaceFlowers(flowerbed,flowersToPlant));
    }

}