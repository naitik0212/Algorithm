package string;

//ctci check permutations.

public class anagram {
    private static boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        if(s.length() != t.length())
            return false;

        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Hello", "asdas" ));
        System.out.println(isAnagram("anagram", "anagarm" ));

    }

}
