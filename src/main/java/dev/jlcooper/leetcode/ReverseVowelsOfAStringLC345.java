package dev.jlcooper.leetcode;


//Given a string s, reverse only all the vowels in the string and return it.
//
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in
// both lower and upper cases, more than once.

//Example 1:
//
//Input: s = "hello"
//Output: "holle"
//
//Example 2:
//
//Input: s = "leetcode"
//Output: "leotcede"

public class ReverseVowelsOfAStringLC345 {

    StringBuilder result;
    int left = 0;
    int right = 0;

    public String reverseVowels(String s) {
        result = new StringBuilder(s);
        right = s.length() - 1;

        while(left < right){

            if( !isVowel(s.charAt(left)) ){
                left++;
            }

            if( !isVowel(s.charAt(right)) ){
                right--;
            }

            if( isVowel(s.charAt(left)) && isVowel(s.charAt(right)) ){
                char temp = s.charAt(left);
                result.setCharAt(left,s.charAt(right));
                result.setCharAt(right,temp);

                left++;
                right--;
            }
        }

        return result.toString();
    }

    private boolean isVowel(char ch){

        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
