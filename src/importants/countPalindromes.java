package importants;

class countPalindromes {
    private int count = 0;

    public int countSubstrings(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            findPalindrome(s, i, i);
            findPalindrome(s, i+1 , i);
        }

        return count;
    }

    private void findPalindrome(String s, int right, int left) {
        while (right < s.length() && left >=0 && s.charAt(left) == s.charAt(right))         {
            count++;
            right++;
            left--;
        }
    }
}
