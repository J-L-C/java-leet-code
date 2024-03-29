package dev.jlcooper.leetcode;

import java.util.ArrayList;
import java.util.List;

//Source: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
/*
* There are n kids with candies. You are given an integer array candies,
* where each candies[i] represents the number of candies the ith kid has, and
* an integer extraCandies, denoting the number of extra candies that you have.
* Return a boolean array result of length n, where result[i] is true if,
* after giving the ith kid all the extraCandies, they will have the greatest number of
* candies among all the kids, or false otherwise.
* Note that multiple kids can have the greatest number of candies.
*
* */

public class KidsWithCandiesLC1431 {


    int maxCandies = 0;
    List<Boolean> result = new ArrayList<>();


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        //find the maxCandies
        for(int i = 0; i < candies.length; i++){

            if(candies[i] > maxCandies){
                maxCandies = candies[i];
            }
        }

        //compute the array
        for(int i = 0; i < candies.length; i++){

            if(candies[i] + extraCandies >= maxCandies)
                result.add(true);
            else
                result.add(false);

        }

        return result;
    }
}
