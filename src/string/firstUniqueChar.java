package string;

public class firstUniqueChar {

    private static char firstUniqChar(String s) {

        char[] a = s.toCharArray();

        for(int i=0; i<a.length;i++){
            if(s.indexOf(a[i])==s.lastIndexOf(a[i])){return s.charAt(i);}
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("Hello" ));
        System.out.println(firstUniqChar1("asdkjasdljasdknasjbcjkashdasnclk"));

    }

    private static char firstUniqChar1(String s) {
        if(s == null)
            return ' ';
        int[] freq = new int[26];
        char[] sc = s.toCharArray();
        for(char c : sc)
            freq[c - 'a']++;
        for(int i = 0;i < sc.length;i++) {
            if(freq[sc[i] - 'a'] == 1)
                return s.charAt(i);
        }
        return ' ';
    }
}
