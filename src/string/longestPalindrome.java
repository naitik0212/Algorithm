package string;/* https://leetcode.com/problems/longest-palindrome/description/ */

import java.util.*;

public class longestPalindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome in 12112 is " +  longestPalindromeString("121"));
        System.out.println("Palindrome in abacsc is " +longestPalindromeString("abacsc"));


    }

    private static String longestPalindromeString(String s) {
        if(s == null || s.length() == 0){
            return null;
        }
        //Assuming longest string to be 1 char long
        String ans = s.substring(0,1);

        for(int i =0; i< s.length() - 1; i++) {
            //Even Cases:
                String pal = findPalindrome(s,i, i+1);
                if (pal.length() > ans.length()) {
                    ans = pal;
                }
                //Odd Cases:
                pal = findPalindrome(s,i, i);
                if (pal.length() > ans.length()) {
                    ans = pal;}

        }


        return ans;
    }

    private static String findPalindrome(String s, int start, int end) {
        if(start>end){
            return null;
        }

        while(start >= 0 && end <= s.length()-1 && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;

        }

        return s.substring(start+1, end);

    }
}
