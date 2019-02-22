package importants;

import java.util.Arrays;

public class reOrderLogFiles {
        public String[] reorderLogFiles(String[] logs) {
            Arrays.sort(logs, (s1, s2) -> {
                int s1Index = s1.indexOf(' ');
                int s2Index = s2.indexOf(' ');
                char c1 = s1.charAt(s1Index + 1);
                char c2 = s2.charAt(s2Index + 1);
                //if one is letter, one is number
                if(Math.abs(c1 - c2) >= 40) {
                    return c2 - c1;
                }
                //if both are letter
                else if (c1 >= 97) {
                    int compareContent =
                            s1.substring(s1Index + 1, s1.length())
                                    .compareTo(s2.substring(s2Index + 1, s2.length()));

                    return compareContent != 0 ? compareContent
                            : s1.substring(0, s1Index).compareTo(s2.substring(0, s2Index));
                }
                //no compare if both are numbers
                return 0;
            });
            return logs;
        }
    }


