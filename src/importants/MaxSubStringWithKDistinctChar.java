package importants;

import java.util.*;

public class MaxSubStringWithKDistinctChar
{
    private int countkDist(String s, int k)
    {
        if(s == null || k == 0 || k > s.length()){
            return 0;
        }

        int result = 0;
        int count[] = new int[26];

        for (int i = 0; i < s.length(); i++)
        {
            int distinct = 0;
            Arrays.fill(count, 0);

            for (int j = i; j < s.length(); j++)
            {
                if (count[s.charAt(j) - 'a'] == 0)
                    distinct++;

                count[s.charAt(j) - 'a']++;

                if (k == distinct)
                    result++;
            }
        }
        return result;

    }

    // Driver Program
    public static void main(String[] args)
    {
        MaxSubStringWithKDistinctChar ob = new MaxSubStringWithKDistinctChar();
        String ch = "pqpqs";
        int k = 2;
        System.out.println("Total substrings with exactly " +
                k +    " distinct characters : "
                + ob.countkDist(ch, k));
    }
}


// you can also use imports, for example:

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {

    Map<Integer, Integer> timeStamp = new HashMap<>();

    public String[] solution(String[] A, int Y) {
        Map<String, Map<Integer, Integer>> clientMin = new HashMap<>();
        // map of current min and count for that client

        // System.out.println(Y);
        for(String s: A) {
            String a[] = s.split(" ");
            int currentMin = Integer.parseInt(a[1])/ 60;
            String client = a[0];
            Map<Integer, Integer> temp = new HashMap<>();

            if(clientMin.containsKey(client)) {
                if(temp.containsKey(currentMin)) {
                    temp.put(currentMin, temp.get(currentMin) + 1);
                }
            } else{
                temp.put(currentMin, 1);
            }
            clientMin.put(client, temp);



            if(timeStamp.containsKey(currentMin)){
                timeStamp.put(currentMin, timeStamp.get(currentMin) + 1);
            }else{
                timeStamp.put(currentMin, 1);
            }
        }


        System.out.println(timeStamp);

        return A;
    }
}

// class pair {
//     private Map<String, Integer> clientRequest = new HashMap<>();
//     private int timeStamp;

//     pair(Map<String, Integer> clientRequest, int timeStamp){
//         this.clientRequest = clientRequest;
//     }
// }

// global - how many request in each minute.
//2 hashmaps: global for minutes and local timestamp