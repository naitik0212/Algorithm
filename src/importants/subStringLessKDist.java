package importants;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class subStringLessKDist {
    private static List<String> subStringLessKDist(String inputString, int num) {
        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();

        if(num < 2 || num > inputString.length()){
            return result;
        }
        for(int i = 0; i < inputString.length() - num + 1; i++) {
            String temp = inputString.substring(i, i + num);
            if(checkDistinct(temp)){
                set.add(temp);
            }
        }
        result.addAll(set);
        return result;
    }

    private static boolean checkDistinct(String s) {
            boolean flag = false;
            int[] freq = new int[26];
            char[] sc = s.toCharArray();

            for(char c : sc)
                freq[c - 'a']++;

            for(int i = 0;i < 26;i++) {
                if(freq[i]>2){
                    return false;
                }
                if(freq[i] > 1){
                    if(!flag){
                        flag = true;
                    }else{
                        return false;
                    }
                }
            }
        return flag;
    }

    public static void main(String args[]) {
        System.out.println(subStringLessKDist("laaawlk", 4));
    }
}
