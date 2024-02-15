package dev.jlcooper.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsOfAStringLC345Test {

    ReverseVowelsOfAStringLC345 solution;

    @BeforeEach
    public void before(){
        solution = new ReverseVowelsOfAStringLC345();
    }


    @Test
    public void reverseVowels_shouldReverseTheVowelsInTheStringHello(){

        String testString = "hello";
        String expectedString = "holle";

        Assertions.assertEquals(expectedString,solution.reverseVowels(testString));
    }
}