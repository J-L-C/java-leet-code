package dev.jlcooper.leetcode;

//Source:https://leetcode.com/problems/maximum-average-subarray-i/
//You are given an integer array nums consisting of n elements, and an integer k.
//
//Find a contiguous subarray whose length is equal to k that
//has the maximum average value and return this value.
//Any answer with a calculation error less than 10-5 will be accepted.

public class MaximumAverageSubarray1LC643 {


    public double findMaxAverage(int[] nums, int k) {

        double rollingSum = 0.00;
        double maxAverage = 0.00;

        if(nums.length == 1)
            return nums[0] / k;

        for(int j = 0; j < k; j++){

            rollingSum += nums[j];
        }

        maxAverage = rollingSum/k;

        for (int i = k; i < nums.length; i++){

            rollingSum += nums[i] - nums[i - k];

            double average = rollingSum / k;

            if( average > maxAverage)
                maxAverage = average;
        }

        return maxAverage;
    }
}
