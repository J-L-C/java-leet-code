package dev.jlcooper.leetcode;

//Source:https://leetcode.com/problems/move-zeroes/
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.

public class MoveZeroesLC285 {


    public void moveZeroes(int[] nums) {

        int prev = 0;
        int next = 1;
        int temp = 0;

        while (next < nums.length){

            //swap step
            if(nums[prev] == 0 && nums[next] != 0){
                temp = nums[prev];
                nums[prev] = nums[next];
                nums[next] = temp;
                prev++;
                next++;
                continue;
            }

            if(prev + 1 == next && nums[prev] != 0) {
                prev++;
                next++;
            }else if(nums[next] == 0){
                next++;
            } else if(nums[prev] != 0){
                prev++;
            }
        }
    }
}
