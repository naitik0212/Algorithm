package string;

//CTCI question

import java.util.HashSet;

public class uniqueCharString {

    public static void main(String args[]){
        String s1 = "abcdef";
        String s2 = "abcads";

        System.out.println(isUnique(s1));
        System.out.println(isUnique(s2));


    }

    private static boolean isUnique(String s) {
        HashSet<Character> set = new HashSet<>();

        for(int i =0; i< s.length(); i++) {
            if(set.contains(s.charAt(i))){
                return false;
            }else{
                set.add(s.charAt(i));
            }
        }
        return true;

    }

    private static boolean isUniqueChar(String s) {
//        https://stackoverflow.com/questions/9141830/explain-the-use-of-a-bit-vector-for-determining-if-all-characters-are-unique
        return true;
    }
}
