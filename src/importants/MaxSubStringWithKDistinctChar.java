package importants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

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