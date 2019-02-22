package importants;/* https://leetcode.com/problems/longest-palindrome/description/ */

public class longestPalindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome in xyyxabcdcba is " + longestPalindromeString("xyyxabcdcba"));
        System.out.println("Palindrome in abacsc is " + longestPalindromeString("abacsc"));


    }

    private static String longestPalindromeString(String s) {
    if (s == null || s.length() == 0) {
        return null;
    }
    // Assuming longest string to be 1 char long
    String ans = s.substring(0, 1);

    for (int i = 0; i < s.length() - 1; i++) {
        // Even Cases:
        String palindrome = findPalindrome(s, i, i + 1);
        if ((palindrome != null ? palindrome.length() : 0) > ans.length()) {
            ans = palindrome;
        }

        // Odd Cases:
        palindrome = findPalindrome(s, i, i);
        if ((palindrome != null ? palindrome.length() : 0) > ans.length()) {
            ans = palindrome;
        }
    }
    return ans;
}

    private static String findPalindrome(String s, int start, int end) {
        if (start > end) {
            return null;
        }
        while (start >= 0 && end <= s.length() - 1 && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return s.substring(start + 1, end);
    }
}
