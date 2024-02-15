package dev.jlcooper.leetcode;

import java.util.ArrayList;
import java.util.List;

//Source:https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
/*
You have a long flowerbed in which some of the plots are planted, and some are not.
However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0
means empty and 1 means not empty, and an integer n, return true if n
new flowers can be planted in the flowerbed without violating the
no-adjacent-flowers rule and false otherwise.
* */

public class CanPlaceFlowerLC605 {


    public boolean canPlaceFlowers(int[] flowerbed, int flowersToPlant) {

        if(flowersToPlant == 0)
            return true;

        if(flowerbed.length == 1){
            return flowerbed[0] == 0;
        }

        //0 index - check right
        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            flowersToPlant--;
            flowerbed[0] = 1;
        }


        //last index - check left
        if(flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0){
            flowersToPlant--;
            flowerbed[flowerbed.length - 1] = 1;
        }


        for(int i = 0; i < flowerbed.length; i++){


            //indexes in between check left and right
            if(i > 1 && i < flowerbed.length -1){
                if(flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    flowersToPlant--;
                    flowerbed[i] = 1;
                }
            }

            if (flowersToPlant <= 0){
                return true;
            }

        }

        return false;

    }
}
