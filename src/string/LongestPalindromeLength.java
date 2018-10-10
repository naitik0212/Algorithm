package string;

import java.util.HashSet;

public class LongestPalindromeLength {
    public static void main(String[] args) {
        System.out.println("Palindrome in 12112 is " + longestPalindromeLength("121"));
        System.out.println("Palindrome in abacsc is " + longestPalindromeLength("abacsc"));


    }

    private static int longestPalindromeLength(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }
        int count = 0;

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                count++;
            } else {
                set.add(s.charAt(i));
            }
        }
        if (!set.isEmpty()) return count * 2 + 1;

        return count * 2;
    }
}