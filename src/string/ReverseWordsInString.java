package string;

public class ReverseWordsInString {
    private static String reverseWords(String s) {
        if(s == null || s.length() == 0){
            return "";
        }

        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; --i) {
            if (!words[i].equals("")) {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }

    public static void main(String args[]) {
        System.out.println(reverseWords("The Sky is    blue"));
    }
}
