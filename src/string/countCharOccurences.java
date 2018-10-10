package string;/*count the number of occurrences of each character in a string?*/

import java.util.HashMap;

public class countCharOccurences {
    public static void main(String args[]){
        characterCount("Java");

        characterCount("All Isa Well");

        characterCount("Done And Gone");
    }

    private static void characterCount(String s) {
        HashMap<Character, Integer> solution = new HashMap<>();
        s = s.toLowerCase();

        for(int i =0; i < s.length(); i++){
            if(solution.containsKey(s.charAt(i))){
                solution.put(s.charAt(i), solution.get(s.charAt(i))+1);
            }else{
                solution.put((s.charAt(i)),1);
            }
        }
        if(solution.containsKey(' ')){
            solution.remove(' ');
        }

        System.out.println(solution);
    }
}
