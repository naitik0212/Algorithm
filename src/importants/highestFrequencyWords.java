package importants;

import java.util.*;

public class highestFrequencyWords {

    public static void main(String args[]) {
        String sentence = "Jack and Jill went to the market to buy bread and cheese. Cheese is Jack's and Jill's favorite food.";
        String[] excludedW = {"and", "he","the", "to", "is","Jack", "Jill"};

        System.out.println(findHighFreqWords(sentence, excludedW));
    }

    private static ArrayList findHighFreqWords(String sentence, String[] wordsToExclude) {

        ArrayList<String> ans = new ArrayList<>();
        if (sentence == null || sentence.length() == 0) {
            return ans;
        }

        sentence = sentence.toLowerCase();
        int maxCount = 0;

        String[] words = sentence.split("[\\p{Punct}\\s]+");
        Map<String, Integer> map = new HashMap<>();
        Set<String> excluded = new HashSet<>();

        for (String word : wordsToExclude) {
            excluded.add(word.toLowerCase());
        }


        for (String word : words) {
            if (!(excluded.contains(word))) {
                map.put(word, map.getOrDefault(word, 0) + 1);
                if (map.get(word) > maxCount) {
                    maxCount = map.get(word);
                }
            }
        }


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                ans.add(entry.getKey());
            }
        }
        return ans;


//        for(String word: wordsToExclude){
//            String temp = word.toLowerCase();
//            if(map.containsKey(temp)) {
//                map.remove(temp);
//            }
//        }

//        int max = 0;
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if(entry.getValue() > max){
//                max = entry.getValue();
//            }
//        }
    }
}
