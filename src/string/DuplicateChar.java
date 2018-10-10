package string;

import java.util.HashMap;

public class DuplicateChar {
    public static void main(String args[]){
        DuplcateCount("JavaJ2EE");

        DuplcateCount("All Isa Well");

        DuplcateCount("Done And Gone");
    }

    private static void DuplcateCount(String s) {
        HashMap<Character, Integer> solution = new HashMap<>();
        s = s.toLowerCase();
        int threshold = 2;

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
        solution.values().removeIf(value -> value < threshold);

        System.out.println(solution);
    }
}
