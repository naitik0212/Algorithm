package string;

public class removeReplaceWhiteSpaces {
    public static void main(String args[]){
        replaceSpaces("Java   a");

        removeSpaces1("All Isa Well");

        replaceSpaces("Mr John Smith");
    }

    private static void replaceSpaces(String s) {
        System.out.println(s.replaceAll("\\s","%20"));
    }

    private static void removeSpaces1(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!= ' ') {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    private static  void replaceSpace(String s){
        char[] str = new char[s.length()];
        int trueLength = s.length();
        int spaceCount = 0, index;

        for(int i =0; i< trueLength; i++) {

        }
    }
}
